package it.previnet.academy.fullstack.application.adapter.mapper;

import it.previnet.academy.fullstack.bean.Nominativo;
import it.previnet.academy.fullstack.model.NominativoEntity;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NominativoMapper extends AbstractMapper<NominativoEntity, Nominativo> {

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

        /* TODO */

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

        /* TODO */

        return entity;
    }
}
