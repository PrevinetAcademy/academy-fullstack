package it.previnet.academy.fullstack.application.adapter.mapper;

import it.previnet.academy.fullstack.bean.DocumentoIdentificazione;
import it.previnet.academy.fullstack.bean.enums.TipoDocumentoIdentificazione;
import it.previnet.academy.fullstack.model.DocumentoIdentificazioneEntity;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DocumentoIdentificazioneMapper extends AbstractMapper<DocumentoIdentificazioneEntity, DocumentoIdentificazione> {

    @Override
    public DocumentoIdentificazione mapEntityToBean(DocumentoIdentificazioneEntity entity) {
        return mapEntityToBean(entity, new DocumentoIdentificazione());
    }

    @Override
    public DocumentoIdentificazione mapEntityToBean(DocumentoIdentificazioneEntity entity, DocumentoIdentificazione bean) {
        if (entity == null) {
            return null;
        }

        if (bean == null) {
            bean = new DocumentoIdentificazione();
        }

        bean.setTokenDocumentoIdentificazion(entity.getTokenDocumentoIdentificazion());
        bean.setCodDocumentoIdentificazione(entity.getCodDocumentoIdentificazione());
        bean.setCodNazione(entity.getCodNazione());
        bean.setCodSiglaProvinciaRilascio(entity.getCodSiglaProvinciaRilascio());
        bean.setDataFine(entity.getDataFine());
        bean.setDataInizio(entity.getDataInizio());
        bean.setDataRilascio(entity.getDataRilascio());
        bean.setDataScadenza(entity.getDataScadenza());
        bean.setDataTimestamp(entity.getDataTimestamp());
        bean.setDenEnteRilascio(entity.getDenEnteRilascio());
        bean.setDenLocalitaRilascio(entity.getDenLocalitaRilascio());
        bean.setDenLogin(entity.getDenLogin());
        bean.setTipoDocumentoIdentificazione(entity.getTipoDocumentoIdentificazione() == null ? null : TipoDocumentoIdentificazione.lookup(entity.getTipoDocumentoIdentificazione()));
        bean.setTokenNominativo(entity.getNominativo().getTokenNominativo());

        return bean;
    }

    @Override
    public DocumentoIdentificazioneEntity mapBeanToEntity(DocumentoIdentificazione bean) {
        return mapBeanToEntity(bean, new DocumentoIdentificazioneEntity());
    }

    @Override
    public DocumentoIdentificazioneEntity mapBeanToEntity(DocumentoIdentificazione bean, DocumentoIdentificazioneEntity entity) {
        if (bean == null) {
            return null;
        }

        if (entity == null) {
            entity = new DocumentoIdentificazioneEntity();
        }

        entity.setTokenDocumentoIdentificazion(bean.getTokenDocumentoIdentificazion());
        entity.setCodDocumentoIdentificazione(bean.getCodDocumentoIdentificazione());
        entity.setCodNazione(bean.getCodNazione());
        entity.setCodSiglaProvinciaRilascio(bean.getCodSiglaProvinciaRilascio());
        entity.setDataFine(bean.getDataFine());
        entity.setDataInizio(bean.getDataInizio());
        entity.setDataRilascio(bean.getDataRilascio());
        entity.setDataScadenza(bean.getDataScadenza());
        entity.setDataTimestamp(bean.getDataTimestamp());
        entity.setDenEnteRilascio(bean.getDenEnteRilascio());
        entity.setDenLocalitaRilascio(bean.getDenLocalitaRilascio());
        entity.setDenLogin(bean.getDenLogin());
        entity.setTipoDocumentoIdentificazione(bean.getTipoDocumentoIdentificazione() == null ? null : bean.getTipoDocumentoIdentificazione().value);

        return entity;
    }
}
