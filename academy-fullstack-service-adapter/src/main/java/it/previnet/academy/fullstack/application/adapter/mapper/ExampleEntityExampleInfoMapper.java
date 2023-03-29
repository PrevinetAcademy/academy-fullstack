package it.previnet.academy.fullstack.application.adapter.mapper;


import it.previnet.academy.fullstack.bean.ExampleInfo;
import it.previnet.academy.fullstack.model.ExampleEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ExampleEntityExampleInfoMapper extends AbstractMapper<ExampleEntity, ExampleInfo> {

    @Inject
    StatoEntityStatoInfoMapper statoEntityStatoInfoMapper;

    @Override
    public ExampleInfo mapEntityToBean(ExampleEntity entity) {
        return mapEntityToBean(entity,new ExampleInfo());
    }

    @Override
    public ExampleInfo mapEntityToBean(ExampleEntity entity, ExampleInfo bean) {
        bean.setToken(entity.getToken());
        bean.setStatoInfo(statoEntityStatoInfoMapper.mapEntityToBean(entity.getStato()));
        return bean;
    }

    @Override
    public ExampleEntity mapBeanToEntity(ExampleInfo bean) {
        return mapBeanToEntity(bean,new ExampleEntity());
    }


    @Override
    public ExampleEntity mapBeanToEntity(ExampleInfo bean, ExampleEntity entity) {
        entity.setToken(bean.getToken());
        entity.setStato(statoEntityStatoInfoMapper.mapBeanToEntity(bean.getStatoInfo()));
        return entity;
    }


}
