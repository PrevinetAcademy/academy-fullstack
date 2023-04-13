package it.previnet.academy.fullstack.application.adapter.mapper;

import it.previnet.academy.fullstack.bean.Operazione;
import it.previnet.academy.fullstack.bean.enums.TipoOperazione;
import it.previnet.academy.fullstack.model.OperazioneEntity;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OperazioneMapper extends AbstractMapper<OperazioneEntity, Operazione> {

    @Override
    public Operazione mapEntityToBean(OperazioneEntity entity) {
        return mapEntityToBean(entity, new Operazione());
    }

    @Override
    public Operazione mapEntityToBean(OperazioneEntity entity, Operazione bean) {
        if (entity == null) {
            return null;
        }

        if (bean == null) {
            bean = new Operazione();
        }

        bean.setTokenOperazione(entity.getTokenOperazione());
        bean.setIndStatoOperazione(entity.getIndStatoOperazione());
        bean.setTipoOperazione(entity.getTipoOperazione() != null ? TipoOperazione.lookup(entity.getTipoOperazione()) : null);
        bean.setTipoPagamento(entity.getTipoPagamento());
        bean.setCodUtente(entity.getCodUtente());
        bean.setDataOperazione(entity.getDataOperazione());
        bean.setImpCosto(entity.getImpCosto());
        bean.setImpTotale(entity.getImpTotale());
        bean.setImpImposta(entity.getImpImposta());
        bean.setImpPremioLordo(entity.getImpPremioLordo());
        bean.setCodNumOperazione(entity.getCodNumOperazione());
        bean.setDataRichiesta(entity.getDataRichiesta());
        bean.setIndStatoPagamento(entity.getIndStatoPagamento());
        bean.setCodDivisa(entity.getCodDivisa());
        bean.setImpPremioNetto(entity.getImpPremioNetto());
        bean.setDataEffetto(entity.getDataEffetto());
        bean.setImpCommissioneDistrib(entity.getImpCommissioneDistrib());
        bean.setDataContabile(entity.getDataContabile());
        bean.setImpSpese(entity.getImpSpese());
        bean.setCodOperazione(entity.getCodOperazione());
        bean.setDataArrivo(entity.getDataArrivo());
        bean.setDataEsecuzione(entity.getDataEsecuzione());
        bean.setDataRateazione(entity.getDataRateazione());
        bean.setDataScadenza(entity.getDataScadenza());
        bean.setDataPagamento(entity.getDataPagamento());
        bean.setPercCaricamento(entity.getPercCaricamento());
        bean.setPercImposta(entity.getPercImposta());
        bean.setPercRendimento(entity.getPercRendimento());
        bean.setPercRetrocessione(entity.getPercRetrocessione());
        bean.setDataTimestamp(entity.getDataTimestamp());
        bean.setDenLogin(entity.getDenLogin());

        return bean;
    }

    @Override
    public OperazioneEntity mapBeanToEntity(Operazione bean) {
        return mapBeanToEntity(bean, new OperazioneEntity());
    }

    @Override
    public OperazioneEntity mapBeanToEntity(Operazione bean, OperazioneEntity entity) {
        if (bean == null) {
            return null;
        }

        if (entity == null) {
            entity = new OperazioneEntity();
        }

        entity.setTokenOperazione(bean.getTokenOperazione());
        entity.setIndStatoOperazione(bean.getIndStatoOperazione());
        entity.setTipoOperazione(bean.getTipoOperazione() != null ? bean.getTipoOperazione().value : null);
        entity.setTipoPagamento(bean.getTipoPagamento());
        entity.setCodUtente(bean.getCodUtente());
        entity.setDataOperazione(bean.getDataOperazione());
        entity.setImpCosto(bean.getImpCosto());
        entity.setImpTotale(bean.getImpTotale());
        entity.setImpImposta(bean.getImpImposta());
        entity.setImpPremioLordo(bean.getImpPremioLordo());
        entity.setCodNumOperazione(bean.getCodNumOperazione());
        entity.setDataRichiesta(bean.getDataRichiesta());
        entity.setIndStatoPagamento(bean.getIndStatoPagamento());
        entity.setCodDivisa(bean.getCodDivisa());
        entity.setImpPremioNetto(bean.getImpPremioNetto());
        entity.setDataEffetto(bean.getDataEffetto());
        entity.setImpCommissioneDistrib(bean.getImpCommissioneDistrib());
        entity.setDataContabile(bean.getDataContabile());
        entity.setImpSpese(bean.getImpSpese());
        entity.setCodOperazione(bean.getCodOperazione());
        entity.setDataArrivo(bean.getDataArrivo());
        entity.setDataEsecuzione(bean.getDataEsecuzione());
        entity.setDataRateazione(bean.getDataRateazione());
        entity.setDataScadenza(bean.getDataScadenza());
        entity.setDataPagamento(bean.getDataPagamento());
        entity.setPercCaricamento(bean.getPercCaricamento());
        entity.setPercImposta(bean.getPercImposta());
        entity.setPercRendimento(bean.getPercRendimento());
        entity.setPercRetrocessione(bean.getPercRetrocessione());
        entity.setDataTimestamp(bean.getDataTimestamp());
        entity.setDenLogin(bean.getDenLogin());

        return entity;
    }
}
