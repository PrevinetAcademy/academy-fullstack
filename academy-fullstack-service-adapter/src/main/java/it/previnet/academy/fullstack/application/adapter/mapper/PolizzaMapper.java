package it.previnet.academy.fullstack.application.adapter.mapper;

import it.previnet.academy.fullstack.bean.Polizza;
import it.previnet.academy.fullstack.model.OperazioneEntity;
import it.previnet.academy.fullstack.model.PolizzaEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.HashSet;
import java.util.List;

@ApplicationScoped
public class PolizzaMapper extends AbstractMapper<PolizzaEntity, Polizza> {

    @Inject
    OperazioneMapper operazioneMapper;

    @Override
    public Polizza mapEntityToBean(PolizzaEntity entity) {
        return mapEntityToBean(entity, new Polizza());
    }

    @Override
    public Polizza mapEntityToBean(PolizzaEntity entity, Polizza bean) {
        if (entity == null) {
            return null;
        }

        if (bean == null) {
            bean = new Polizza();
        }

        bean.setTokenPolizza(entity.getTokenPolizza());
        bean.setTipoPremio(entity.getTipoPremio());
        bean.setNumPolizza(entity.getNumPolizza());
        bean.setIndStatoPolizza(entity.getIndStatoPolizza());
        bean.setDataDecorrenzaContratto(entity.getDataDecorrenzaContratto());
        bean.setDataScadenzaContratto(entity.getDataScadenzaContratto());
        bean.setTipoRateazione(entity.getTipoRateazione());
        bean.setCodNumProposta(entity.getCodNumProposta());
        bean.setDataEmissione(entity.getDataEmissione());
        bean.setOperazione(operazioneMapper.mapEntitiesToBeans(entity.getOperazione()));

        return bean;
    }

    @Override
    public PolizzaEntity mapBeanToEntity(Polizza bean) {
        return mapBeanToEntity(bean, new PolizzaEntity());
    }

    @Override
    public PolizzaEntity mapBeanToEntity(Polizza bean, PolizzaEntity entity) {
        if (bean == null) {
            return null;
        }

        if (entity == null) {
            entity = new PolizzaEntity();
        }

        entity.setTokenPolizza(bean.getTokenPolizza());
        entity.setTipoPremio(bean.getTipoPremio());
        entity.setNumPolizza(bean.getNumPolizza());
        entity.setIndStatoPolizza(bean.getIndStatoPolizza());
        entity.setDataDecorrenzaContratto(bean.getDataDecorrenzaContratto());
        entity.setDataScadenzaContratto(bean.getDataScadenzaContratto());
        entity.setTipoRateazione(bean.getTipoRateazione());
        entity.setCodNumProposta(bean.getCodNumProposta());
        entity.setDataEmissione(bean.getDataEmissione());

        List<OperazioneEntity> operazioneEntities = operazioneMapper.mapBeansToEntities(bean.getOperazione());
        if (operazioneEntities != null) {
            entity.setOperazione(new HashSet<>(operazioneEntities));
        } else {
            entity.setOperazione(null);
        }

        return entity;
    }
}
