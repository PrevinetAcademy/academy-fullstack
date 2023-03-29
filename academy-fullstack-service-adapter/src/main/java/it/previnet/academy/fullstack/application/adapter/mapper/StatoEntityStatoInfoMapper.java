package it.previnet.academy.fullstack.application.adapter.mapper;

import it.previnet.academy.fullstack.bean.enums.StatoInfo;
import it.previnet.academy.fullstack.model.enums.StatoEntity;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StatoEntityStatoInfoMapper extends AbstractMapper<StatoEntity, StatoInfo> {


    @Override
    public StatoInfo mapEntityToBean(StatoEntity entity) {
        if (entity==null){
            return null;
        }
        return StatoInfo.valueOf(entity.toString());
    }

    @Override
    public StatoInfo mapEntityToBean(StatoEntity entity, StatoInfo bean) {
        return null;
    }

    @Override
    public StatoEntity mapBeanToEntity(StatoInfo bean) {
        if (bean==null){
            return null;
        }
        return StatoEntity.valueOf(bean.toString());
    }


    @Override
    public StatoEntity mapBeanToEntity(StatoInfo bean, StatoEntity entity) {
        return null;
    }


}
