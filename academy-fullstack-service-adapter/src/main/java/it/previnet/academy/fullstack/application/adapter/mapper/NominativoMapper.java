package it.previnet.academy.fullstack.application.adapter.mapper;

import it.previnet.academy.fullstack.bean.Nominativo;
import it.previnet.academy.fullstack.bean.enums.TipoSesso;
import it.previnet.academy.fullstack.model.DocumentoIdentificazioneEntity;
import it.previnet.academy.fullstack.model.NominativoEntity;
import it.previnet.academy.fullstack.model.RecapitoNominativoEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.HashSet;
import java.util.List;

@ApplicationScoped
public class NominativoMapper extends AbstractMapper<NominativoEntity, Nominativo> {

    @Inject
    RecapitoNominativoMapper recapitoNominativoMapper;

    @Inject
    DocumentoIdentificazioneMapper documentoIdentificazioneMapper;

    @Override
    public Nominativo mapEntityToBean(NominativoEntity entity) {
        return mapEntityToBean(entity, new Nominativo());
    }

    @Override
    public Nominativo mapEntityToBean(NominativoEntity entity, Nominativo bean) {
        if (entity == null) {
            return null;
        }

        if (bean == null) {
            bean = new Nominativo();
        }

        bean.setTokenNominativo(entity.getTokenNominativo());
        bean.setCodFiscale(entity.getCodFiscale());
        bean.setCodPartitaIva(entity.getCodPartitaIva());
        bean.setDenCognome(entity.getDenCognome());
        bean.setDenNome(entity.getDenNome());
        bean.setTipoSesso(entity.getTipoSesso() == null ? null : TipoSesso.lookup(entity.getTipoSesso()));
        bean.setDataNascita(entity.getDataNascita());
        bean.setCodProvinciaIstatNascita(entity.getCodProvinciaIstatNascita());
        bean.setDenComuneNascita(entity.getDenComuneNascita());
        bean.setCodNazioneCittadinanza(entity.getCodNazioneCittadinanza());
        bean.setDescProfessione(entity.getDescProfessione());
        bean.setDescTitolo(entity.getDescTitolo());
        bean.setDenNazionalita(entity.getDenNazionalita());
        bean.setDenNominativo(entity.getDenNominativo());
        bean.setDenRagioneSociale(entity.getDenRagioneSociale());
        bean.setDenRagioneSocialeBreve(entity.getDenRagioneSocialeBreve());
        bean.setDataTimestamp(entity.getDataTimestamp());
        bean.setDenLogin(entity.getDenLogin());
        bean.setFlagPrivacy(entity.getFlagPrivacy());
        bean.setFlagPrivacy2(entity.getFlagPrivacy2());
        bean.setFlagPrivacy3(entity.getFlagPrivacy3());
        bean.setFlagPrivacy4(entity.getFlagPrivacy4());
        bean.setDataFirmaPrivacy(entity.getDataFirmaPrivacy());

        bean.setRecapitoNominativo(recapitoNominativoMapper.mapEntitiesToBeans(entity.getRecapitoNominativo()));
        bean.setDocumentoIdentificazione(documentoIdentificazioneMapper.mapEntitiesToBeans(entity.getDocumentoIdentificazione()));

        return bean;
    }

    @Override
    public NominativoEntity mapBeanToEntity(Nominativo bean) {
        return mapBeanToEntity(bean, new NominativoEntity());
    }

    @Override
    public NominativoEntity mapBeanToEntity(Nominativo bean, NominativoEntity entity) {
        if (bean == null) {
            return null;
        }

        if (entity == null) {
            entity = new NominativoEntity();
        }

        entity.setTokenNominativo(bean.getTokenNominativo());
        entity.setCodFiscale(bean.getCodFiscale());
        entity.setCodPartitaIva(bean.getCodPartitaIva());
        entity.setDenCognome(bean.getDenCognome());
        entity.setDenNome(bean.getDenNome());
        entity.setTipoSesso(bean.getTipoSesso() == null ? null : bean.getTipoSesso().value);
        entity.setDataNascita(bean.getDataNascita());
        entity.setCodProvinciaIstatNascita(bean.getCodProvinciaIstatNascita());
        entity.setDenComuneNascita(bean.getDenComuneNascita());
        entity.setCodNazioneCittadinanza(bean.getCodNazioneCittadinanza());
        entity.setDescProfessione(bean.getDescProfessione());
        entity.setDescTitolo(bean.getDescTitolo());
        entity.setDenNazionalita(bean.getDenNazionalita());
        entity.setDenNominativo(bean.getDenNominativo());
        entity.setDenRagioneSociale(bean.getDenRagioneSociale());
        entity.setDenRagioneSocialeBreve(bean.getDenRagioneSocialeBreve());
        entity.setDataTimestamp(bean.getDataTimestamp());
        entity.setDenLogin(bean.getDenLogin());
        entity.setFlagPrivacy(bean.getFlagPrivacy());
        entity.setFlagPrivacy2(bean.getFlagPrivacy2());
        entity.setFlagPrivacy3(bean.getFlagPrivacy3());
        entity.setFlagPrivacy4(bean.getFlagPrivacy4());
        entity.setDataFirmaPrivacy(bean.getDataFirmaPrivacy());

        List<RecapitoNominativoEntity> recapitoNominativoEntities = recapitoNominativoMapper.mapBeansToEntities(bean.getRecapitoNominativo());
        entity.setRecapitoNominativo(new HashSet<>(recapitoNominativoEntities));

        List<DocumentoIdentificazioneEntity> documentoIdentificazioneEntities = documentoIdentificazioneMapper.mapBeansToEntities(bean.getDocumentoIdentificazione());
        entity.setDocumentoIdentificazione(new HashSet<>(documentoIdentificazioneEntities));

        return entity;
    }
}
