package it.previnet.academy.fullstack.repository.adapter;

import it.previnet.academy.fullstack.model.OperazioneEntity;
import it.previnet.academy.fullstack.model.PolizzaEntity;
import it.previnet.academy.fullstack.repository.port.OperazioneRepository;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.TypedQuery;
import java.util.List;

@ApplicationScoped
public class OperazioneRepositoryImpl extends AbstractRepositoryImpl<OperazioneEntity> implements OperazioneRepository {
    private static final Logger logger = Logger.getLogger(OperazioneRepositoryImpl.class);

    @Override
    public List<OperazioneEntity> fetch(Integer tokenPolizza) {
        logger.info("called REPOSITORY fetch");

        String strQuery = "SELECT o FROM OperazioneEntity o JOIN o.polizza p WHERE p.tokenPolizza = :tokenPolizza ";
        TypedQuery<OperazioneEntity> query = this.getEntityManager().createQuery(strQuery, OperazioneEntity.class);
        query.setParameter("tokenPolizza", tokenPolizza);

        return query.getResultList();
    }
}
