package it.previnet.academy.fullstack.application.adapter.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractMapper<E, B> {

	public abstract B mapEntityToBean(E entity);
	
	public abstract B mapEntityToBean(E entity, B bean);

	public abstract E mapBeanToEntity(B bean);

	public abstract E mapBeanToEntity(B bean, E entity);
	
	public List<B> mapEntitiesToBeans(Collection<E> entityCollection) {

		List<B> beans = new ArrayList<B>();

		for (E c : entityCollection) {
			beans.add(mapEntityToBean(c));
		}

		return beans;
	}
	
    public List<E> mapBeansToEntities(Collection<B> beanCollection) {

        List<E> entities = new ArrayList<E>();

        for (B c : beanCollection) {
            entities.add(mapBeanToEntity(c));
        }

        return entities;
    }
}
