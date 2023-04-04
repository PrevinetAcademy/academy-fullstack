package it.previnet.academy.fullstack.repository.adapter;

import it.previnet.academy.fullstack.model.NominativoEntity;
import it.previnet.academy.fullstack.repository.port.NominativoRepository;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class NominativoRepositoryImpl extends AbstractRepositoryImpl<NominativoEntity> implements NominativoRepository {
    private static final Logger logger = Logger.getLogger(NominativoRepositoryImpl.class);

    @Override
    public List<NominativoEntity> fetch(String cognome, String nome, String tipoSesso) {
        logger.info("called REPOSITORY fetch");

        Map<String, Object> parameters = new HashMap<>();
        StringBuilder strQuery = new StringBuilder("SELECT n FROM NominativoEntity n WHERE 1 = 1 ");

        if (cognome != null && !cognome.isEmpty()) {
            strQuery.append("AND n.denCognome = :cognome ");
            parameters.put("cognome", cognome);
        }
        if (nome != null && !nome.isEmpty()) {
            strQuery.append("AND n.denNome = :nome ");
            parameters.put("nome", nome);
        }
        if (tipoSesso != null && !tipoSesso.isEmpty()) {
            strQuery.append("AND n.tipoSesso = :tipoSesso ");
            parameters.put("tipoSesso", tipoSesso);
        }

        TypedQuery<NominativoEntity> query = this.getEntityManager().createQuery(strQuery.toString(), NominativoEntity.class);
        parameters.forEach(query::setParameter);

        return query.getResultList();
    }
}
