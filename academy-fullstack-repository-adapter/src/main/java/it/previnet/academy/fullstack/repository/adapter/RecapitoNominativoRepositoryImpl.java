package it.previnet.academy.fullstack.repository.adapter;

import it.previnet.academy.fullstack.model.RecapitoNominativoEntity;
import it.previnet.academy.fullstack.repository.port.RecapitoNominativoRepository;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.TypedQuery;
import java.util.List;

@ApplicationScoped
public class RecapitoNominativoRepositoryImpl extends AbstractRepositoryImpl<RecapitoNominativoEntity> implements RecapitoNominativoRepository {
    private static final Logger logger = Logger.getLogger(RecapitoNominativoRepositoryImpl.class);

    @Override
    public List<RecapitoNominativoEntity> fetch(Integer tokenNominativo) {
        logger.info("called REPOSITORY fetch");

        String strQuery = "SELECT r FROM RecapitoNominativoEntity r JOIN r.nominativo n WHERE n.tokenNominativo = :tokenNominativo ";

        TypedQuery<RecapitoNominativoEntity> query = this.getEntityManager().createQuery(strQuery, RecapitoNominativoEntity.class);
        query.setParameter("tokenNominativo", tokenNominativo);

        return query.getResultList();
    }
}
