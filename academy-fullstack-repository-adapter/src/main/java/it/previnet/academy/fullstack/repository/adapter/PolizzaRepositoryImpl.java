package it.previnet.academy.fullstack.repository.adapter;

import it.previnet.academy.fullstack.bean.enums.TipoOperazione;
import it.previnet.academy.fullstack.model.PolizzaEntity;
import it.previnet.academy.fullstack.repository.port.PolizzaRepository;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.TypedQuery;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class PolizzaRepositoryImpl extends AbstractRepositoryImpl<PolizzaEntity> implements PolizzaRepository {
    private static final Logger logger = Logger.getLogger(PolizzaRepositoryImpl.class);

    @Override
    public List<PolizzaEntity> fetch(String indStatoPolizza, String numPolizza) {
        logger.info("called REPOSITORY fetch");

        Map<String, Object> parameters = new HashMap<>();
        StringBuilder strQuery = new StringBuilder("SELECT p FROM PolizzaEntity p WHERE 1=1 ");
        if (indStatoPolizza != null && !indStatoPolizza.isEmpty()) {
            strQuery.append("AND p.indStatoPolizza = :stato");
            parameters.put("stato", indStatoPolizza);
        }
        if (numPolizza != null) {
            strQuery.append("AND p.numPolizza = :numPolizza");
            parameters.put("numPolizza", numPolizza);
        }

        TypedQuery<PolizzaEntity> query = this.getEntityManager().createQuery(strQuery.toString(), PolizzaEntity.class);
        parameters.forEach(query::setParameter);

        return query.getResultList();
    }

    /*
     * ESERCIZIO 1
     * Selezione delle polizze la cui data decorrenza polizza sia superiore al parametro di filtro
     */
    @Override
    public List<PolizzaEntity> esercizio1(LocalDateTime dataDecorrenza) {
        logger.info("called REPOSITORY esercizio1");

        Map<String, Object> parameters = new HashMap<>();
        StringBuilder strQuery = new StringBuilder("SELECT p FROM PolizzaEntity p WHERE 1=1 ");
        if (dataDecorrenza != null) {
            strQuery.append("AND p.dataDecorrenzaContratto >= :dataDecorrenza ");
            parameters.put("dataDecorrenza", dataDecorrenza);
        }

        TypedQuery<PolizzaEntity> query = this.getEntityManager()
                .createQuery(strQuery.toString(), PolizzaEntity.class)
                .setMaxResults(100); // LIMIT 100
        parameters.forEach(query::setParameter);

        return query.getResultList();
    }

    /*
     * ESERCIZIO 2
     * Selezione delle polizze con un'operazione di sottoscrizione ('0')  la cui data decorrenza sia superiore al parametro di filtro
     */
    @Override
    public List<PolizzaEntity> esercizio2(LocalDateTime dataDecorrenza) {
        logger.info("called REPOSITORY esercizio2");

        Map<String, Object> parameters = new HashMap<>();
        StringBuilder strQuery = new StringBuilder("SELECT p FROM PolizzaEntity p JOIN p.operazione o WHERE 1=1 ");

        strQuery.append("AND o.tipoOperazione = :tipoOperazione ");
        parameters.put("tipoOperazione", TipoOperazione.SOTTOSCRIZIONE.value);

        if (dataDecorrenza != null) {
            strQuery.append("AND o.dataDecorrenza >= :dataDecorrenza ");
            parameters.put("dataDecorrenza", dataDecorrenza);
        }

        TypedQuery<PolizzaEntity> query = this.getEntityManager()
                .createQuery(strQuery.toString(), PolizzaEntity.class)
                .setMaxResults(100); // LIMIT 100
        parameters.forEach(query::setParameter);

        return query.getResultList();
    }
}
