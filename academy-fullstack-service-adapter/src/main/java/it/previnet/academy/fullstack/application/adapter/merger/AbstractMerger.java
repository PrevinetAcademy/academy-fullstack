package it.previnet.academy.fullstack.application.adapter.merger;

import it.previnet.academy.fullstack.bean.intf.WithToken;
import it.previnet.academy.fullstack.repository.port.AbstractRepository;
import it.previnet.academy.fullstack.application.adapter.util.BeanUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public abstract class AbstractMerger<B extends WithToken, E> {

    private static final Logger logger = LoggerFactory.getLogger(AbstractMerger.class);

    @Inject
    BeanUtil beanUtil;

    public Map<B,Optional<E>> merge(AbstractRepository<E> repository, List<B> beans, Set<E> entities, Class<E> entityClass, BiFunction<B, E, E> beanEntityMapper, Consumer<E> entityToDelete){
        return merge(false,repository,beans.stream().collect(Collectors.toSet()), entities,entityClass,beanEntityMapper,entityToDelete);
    }

    public Map<B,Optional<E>> merge(AbstractRepository<E> repository, Set<B> beans, Set<E> entities, Class<E> entityClass, BiFunction<B, E, E> beanEntityMapper, Consumer<E> entityToDelete){
        return merge(false,repository,beans,entities,entityClass,beanEntityMapper,entityToDelete);
    }
    public Map<B,Optional<E>> merge(boolean logicalDelete, AbstractRepository<E> repository, List<B> beans, Set<E> entities, Class<E> entityClass, BiFunction<B, E, E> beanEntityMapper, Consumer<E> entityToDelete) {
        return merge(logicalDelete,repository,beans.stream().collect(Collectors.toSet()), entities,entityClass,beanEntityMapper,entityToDelete);
    }

    public Map<B,Optional<E>> merge(boolean logicalDelete, AbstractRepository<E> repository, Set<B> beans, Set<E> entities, Class<E> entityClass, BiFunction<B, E, E> beanEntityMapper, Consumer<E> entityToDelete){

        final Map<B,Optional<E>> mapBeansEntitities= beans.stream().collect(Collectors.toMap(bean -> bean, bean -> {
            Optional<E> entity= Optional.empty();
            if (isNewBean(bean)) {
                entity= newEntityInstance(entityClass);
            } else {
                entity= entities.stream().filter((innerEntity) -> match(bean,innerEntity)).findFirst();
                if (entity.isEmpty()){
                    entity= Optional.ofNullable(repository.findByToken(bean.getToken()));
                }
            }
            return entity.map((item) -> beanEntityMapper.apply(bean,item));
        }));

        Set<E> mappedBeansToEntities= mapBeansEntitities.values().stream().filter((optionalItem) -> optionalItem.isPresent()).map((optionalItem) -> optionalItem.get()).collect(Collectors.toSet());

        if (beans.size()!=mappedBeansToEntities.size()){
            throw new RuntimeException("Concurrent entity modification");
        }

        // trova le entity da cancellare
        Set<E> entitiesToDelete= entities.stream().filter((entity) ->
                mappedBeansToEntities.stream().filter((mappedBeansToEntity) -> getEntityIdValue(entity).equals(getEntityIdValue(mappedBeansToEntity))).count()==0
        ).collect(Collectors.toSet());

        entitiesToDelete.forEach(entityToDelete);

        entities.clear();
        entities.addAll(mappedBeansToEntities);
        if (logicalDelete) {
            entities.addAll(entitiesToDelete);
        }

        return mapBeansEntitities;
    }

    protected Number getValue(Field field, Object entity) throws IllegalArgumentException, IllegalAccessException {
        if (field.getType().equals(Long.class) || field.getType().equals(long.class)) {
            return (Long) field.get(entity);
        } else if (field.getType().equals(Integer.class) || field.getType().equals(int.class)) {
            return (Integer) field.get(entity);
        } else {
            throw new IllegalArgumentException("Unsupported type " + field.getType().toString());
        }
    }

    protected Optional<E> newEntityInstance(Class<E> entityClass) {
        try {
            return Optional.of(entityClass.getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
        }
        return Optional.empty();
    }

    protected Number getEntityIdValue(E entity) {
        List<Field> idFields = beanUtil.getFieldAnnotatedWith(entity.getClass(), javax.persistence.Id.class);

        if (idFields.isEmpty()) {
            throw new IllegalArgumentException("entity=" + entity + ": cannot find id");
        }

        if (idFields.size() > 1) {
            throw new IllegalArgumentException("entity=" + entity + ": multiple id fields");
        }

        Field field = idFields.get(0);

        try {
            if (!field.canAccess(entity)) {
                field.setAccessible(true);
            }

            return getValue(field, entity);
        } catch (IllegalArgumentException | IllegalAccessException e) {
            throw new IllegalArgumentException("entity=" + entity + ": error while accessing field", e);
        }
    }

    protected Number getBeanIdValue(B bean) {
        return bean.getToken();
    }

    protected boolean isNewBean(B bean) {
        if (bean == null) {
            return true;
        }

        return bean.getToken()==null || bean.getToken().longValue() <= 0;
    }

    protected boolean match(B bean, E entity) {
        if (bean == null) {
            return entity == null;
        }

        Number beanIdValue = getBeanIdValue(bean);
        Number entityIdValue = getEntityIdValue(entity);

        if (beanIdValue == null) {
            return entityIdValue == null;
        }

        return beanIdValue.equals(entityIdValue);
    }
}
