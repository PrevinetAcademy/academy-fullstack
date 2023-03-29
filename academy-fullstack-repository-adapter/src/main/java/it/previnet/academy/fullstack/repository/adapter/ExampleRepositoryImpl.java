package it.previnet.academy.fullstack.repository.adapter;

import it.previnet.academy.fullstack.bean.request.ExampleSearch;
import it.previnet.academy.fullstack.model.ExampleEntity;
import it.previnet.academy.fullstack.repository.port.ExampleRepository;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class ExampleRepositoryImpl extends AbstractRepositoryImpl<ExampleEntity> implements ExampleRepository {

    private static final Logger logger = Logger.getLogger(ExampleRepositoryImpl.class);

    @Override
    public List<ExampleEntity> fetch(ExampleSearch applicazioneSearch) {
        StringBuilder strQuery = new StringBuilder("SELECT e FROM ExampleEntity e WHERE 1=1");
        Map<String, Object> parameters = new HashMap<>();
        TypedQuery<ExampleEntity> query = this.getEntityManager().createQuery(strQuery.toString(), ExampleEntity.class);
        parameters.forEach((k, v) -> query.setParameter(k, v));
        return query.getResultList();
    }

}
