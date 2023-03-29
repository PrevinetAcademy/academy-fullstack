package it.previnet.academy.fullstack.repository.adapter;

import it.previnet.academy.fullstack.model.PolizzaEntity;
import it.previnet.academy.fullstack.repository.port.PolizzaRepository;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class PolizzaRepositoryImpl extends AbstractRepositoryImpl<PolizzaEntity> implements PolizzaRepository {
    private static final Logger logger = Logger.getLogger(PolizzaRepositoryImpl.class);

    @Override
    public List<PolizzaEntity> fetch(String indStatoPolizza) {
        logger.info("called REPOSITORY fetch");

        Map<String, Object> parameters = new HashMap<>();
        StringBuilder strQuery = new StringBuilder("SELECT p FROM PolizzaEntity p WHERE 1=1 ");
        if (indStatoPolizza != null && !indStatoPolizza.isEmpty()) {
            strQuery.append("AND p.indStatoPolizza = :stato");
            parameters.put("stato", indStatoPolizza);
        }

        TypedQuery<PolizzaEntity> query = this.getEntityManager().createQuery(strQuery.toString(), PolizzaEntity.class);
        parameters.forEach(query::setParameter);

        return query.getResultList();
    }
}
