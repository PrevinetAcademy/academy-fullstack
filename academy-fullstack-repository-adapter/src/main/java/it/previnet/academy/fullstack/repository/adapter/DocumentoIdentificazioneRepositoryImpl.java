package it.previnet.academy.fullstack.repository.adapter;

import it.previnet.academy.fullstack.model.DocumentoIdentificazioneEntity;
import it.previnet.academy.fullstack.model.TipoDocumentoIdentificazioneEntity;
import it.previnet.academy.fullstack.model.TipoSessoEntity;
import it.previnet.academy.fullstack.repository.port.DocumentoIdentificazioneRepository;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.TypedQuery;
import java.util.List;

@ApplicationScoped
public class DocumentoIdentificazioneRepositoryImpl extends AbstractRepositoryImpl<DocumentoIdentificazioneEntity> implements DocumentoIdentificazioneRepository {
    private static final Logger logger = Logger.getLogger(DocumentoIdentificazioneRepositoryImpl.class);

    @Override
    public List<DocumentoIdentificazioneEntity> fetch(Integer tokenNominativo) {
        logger.info("called REPOSITORY fetch");

        String strQuery = "SELECT d FROM DocumentoIdentificazioneEntity d JOIN d.nominativo n WHERE n.tokenNominativo = :tokenNominativo ";

        TypedQuery<DocumentoIdentificazioneEntity> query = this.getEntityManager().createQuery(strQuery, DocumentoIdentificazioneEntity.class);
        query.setParameter("tokenNominativo", tokenNominativo);

        return query.getResultList();
    }

    @Override
    public List<TipoDocumentoIdentificazioneEntity> fetchTipoDocumento() {
        String strQuery = "SELECT t FROM TipoDocumentoIdentificazioneEntity t";
        TypedQuery<TipoDocumentoIdentificazioneEntity> query = this.getEntityManager().createQuery(strQuery, TipoDocumentoIdentificazioneEntity.class);
        return query.getResultList();
    }
}
