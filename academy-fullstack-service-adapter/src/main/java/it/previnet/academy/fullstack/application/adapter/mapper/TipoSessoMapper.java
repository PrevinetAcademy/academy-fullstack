package it.previnet.academy.fullstack.application.adapter.mapper;

import it.previnet.academy.fullstack.bean.TipoSesso;
import it.previnet.academy.fullstack.model.TipoSessoEntity;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TipoSessoMapper extends AbstractMapper<TipoSessoEntity, TipoSesso> {

    @Override
    public TipoSesso mapEntityToBean(TipoSessoEntity entity) {
        return mapEntityToBean(entity, new TipoSesso());
    }

    @Override
    public TipoSesso mapEntityToBean(TipoSessoEntity entity, TipoSesso bean) {
        if (entity == null) {
            return null;
        }

        if (bean == null) {
            bean = new TipoSesso();
        }

        bean.setTipoSesso(entity.getTipoSesso());
        bean.setDenSesso(entity.getDenSesso());

        return bean;
    }

    @Override
    public TipoSessoEntity mapBeanToEntity(TipoSesso bean) {
        return mapBeanToEntity(bean, new TipoSessoEntity());
    }

    @Override
    public TipoSessoEntity mapBeanToEntity(TipoSesso bean, TipoSessoEntity entity) {
        if (bean == null) {
            return null;
        }

        if (entity == null) {
            entity = new TipoSessoEntity();
        }

        entity.setTipoSesso(bean.getTipoSesso());
        entity.setDenSesso(bean.getDenSesso());

        return entity;
    }
}
