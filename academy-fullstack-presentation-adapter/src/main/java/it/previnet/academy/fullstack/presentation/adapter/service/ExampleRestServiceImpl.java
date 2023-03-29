package it.previnet.academy.fullstack.presentation.adapter.service;

import it.previnet.academy.fullstack.application.port.ExampleManager;
import it.previnet.academy.fullstack.bean.ExampleInfo;
import it.previnet.academy.fullstack.bean.request.ExampleSearch;
import it.previnet.academy.fullstack.presentation.port.service.ExampleRestService;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class ExampleRestServiceImpl implements ExampleRestService {

    private static final org.jboss.logging.Logger logger = Logger.getLogger(ExampleRestServiceImpl.class);

    @Inject
    ExampleManager exampleManager;

    @Override
    public List<ExampleInfo> fetch(ExampleSearch exampleSearch) {
        return exampleManager.fetch(exampleSearch);
    }

    @Override
    public ExampleInfo fetch(Long token) {
        ExampleSearch exampleSearch= new ExampleSearch();
        exampleSearch.setToken(token);
        Optional<ExampleInfo> optionalExampleInfo= exampleManager.fetch(exampleSearch).stream().findFirst();
        if (optionalExampleInfo.isPresent()){
            return optionalExampleInfo.get();
        } else {
            return null;
        }
    }

}
