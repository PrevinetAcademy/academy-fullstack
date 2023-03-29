package it.previnet.academy.fullstack.repository.port;

import it.previnet.academy.fullstack.bean.request.ExampleSearch;
import it.previnet.academy.fullstack.model.ExampleEntity;

import java.util.List;

public interface ExampleRepository extends AbstractRepository<ExampleEntity> {
    
    List<ExampleEntity> fetch(ExampleSearch applicazioneSearch);

}
