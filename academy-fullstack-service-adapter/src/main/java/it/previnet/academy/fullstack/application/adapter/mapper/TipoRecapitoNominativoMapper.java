package it.previnet.academy.fullstack.application.adapter.mapper;

import it.previnet.academy.fullstack.bean.TipoRecapitoNominativo;
import it.previnet.academy.fullstack.model.TipoRecapitoNominativoEntity;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TipoRecapitoNominativoMapper extends AbstractMapper<TipoRecapitoNominativoEntity, TipoRecapitoNominativo> {

    @Override
    public TipoRecapitoNominativo mapEntityToBean(TipoRecapitoNominativoEntity entity) {
        return mapEntityToBean(entity, new TipoRecapitoNominativo());
    }

    @Override
    public TipoRecapitoNominativo mapEntityToBean(TipoRecapitoNominativoEntity entity, TipoRecapitoNominativo bean) {
        if (entity == null) {
            return null;
        }

        if (bean == null) {
            bean = new TipoRecapitoNominativo();
        }

        bean.setTipoRecapitoNominativo(entity.getTipoRecapitoNominativo());
        bean.setDenRecapitoNominativo(entity.getDenRecapitoNominativo());

        return bean;
    }

    @Override
    public TipoRecapitoNominativoEntity mapBeanToEntity(TipoRecapitoNominativo bean) {
        return mapBeanToEntity(bean, new TipoRecapitoNominativoEntity());
    }

    @Override
    public TipoRecapitoNominativoEntity mapBeanToEntity(TipoRecapitoNominativo bean, TipoRecapitoNominativoEntity entity) {
        if (bean == null) {
            return null;
        }

        if (entity == null) {
            entity = new TipoRecapitoNominativoEntity();
        }

        entity.setTipoRecapitoNominativo(bean.getTipoRecapitoNominativo());
        entity.setDenRecapitoNominativo(bean.getDenRecapitoNominativo());

        return entity;
    }
}
