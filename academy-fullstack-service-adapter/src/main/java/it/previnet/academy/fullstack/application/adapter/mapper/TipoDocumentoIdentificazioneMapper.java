package it.previnet.academy.fullstack.application.adapter.mapper;

import it.previnet.academy.fullstack.bean.TipoDocumentoIdentificazione;
import it.previnet.academy.fullstack.model.TipoDocumentoIdentificazioneEntity;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TipoDocumentoIdentificazioneMapper extends AbstractMapper<TipoDocumentoIdentificazioneEntity, TipoDocumentoIdentificazione> {

    @Override
    public TipoDocumentoIdentificazione mapEntityToBean(TipoDocumentoIdentificazioneEntity entity) {
        return mapEntityToBean(entity, new TipoDocumentoIdentificazione());
    }

    @Override
    public TipoDocumentoIdentificazione mapEntityToBean(TipoDocumentoIdentificazioneEntity entity, TipoDocumentoIdentificazione bean) {
        if (entity == null) {
            return null;
        }

        if (bean == null) {
            bean = new TipoDocumentoIdentificazione();
        }

        bean.setTipoDocumentoIdentificazione(entity.getTipoDocumentoIdentificazione());
        bean.setDenDocumentoIdentificazione(entity.getDenDocumentoIdentificazione());

        return bean;
    }

    @Override
    public TipoDocumentoIdentificazioneEntity mapBeanToEntity(TipoDocumentoIdentificazione bean) {
        return mapBeanToEntity(bean, new TipoDocumentoIdentificazioneEntity());
    }

    @Override
    public TipoDocumentoIdentificazioneEntity mapBeanToEntity(TipoDocumentoIdentificazione bean, TipoDocumentoIdentificazioneEntity entity) {
        if (bean == null) {
            return null;
        }

        if (entity == null) {
            entity = new TipoDocumentoIdentificazioneEntity();
        }

        entity.setTipoDocumentoIdentificazione(bean.getTipoDocumentoIdentificazione());
        entity.setDenDocumentoIdentificazione(bean.getDenDocumentoIdentificazione());

        return entity;
    }
}
