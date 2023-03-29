package it.previnet.academy.fullstack.application.adapter;

import it.previnet.academy.fullstack.repository.port.ExampleRepository;
import it.previnet.academy.fullstack.application.adapter.mapper.ExampleEntityExampleInfoMapper;
import it.previnet.academy.fullstack.application.port.ExampleManager;
import it.previnet.academy.fullstack.bean.ExampleInfo;
import it.previnet.academy.fullstack.bean.request.ExampleSearch;
import it.previnet.academy.fullstack.application.adapter.util.BeanUtil;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;


@ApplicationScoped
public class ExampleManagerImpl implements ExampleManager {

    private static final Logger logger = Logger.getLogger(ExampleManagerImpl.class);

    @Inject
    ExampleRepository exampleRepository;

    @Inject
    ExampleEntityExampleInfoMapper exampleEntityExampleInfoMapper;

    @Inject
    BeanUtil beanUtil;

    @Override
    @Transactional
    public List<ExampleInfo> fetch(ExampleSearch exampleSearch) {
        return exampleRepository.fetch(exampleSearch).stream().map(exampleEntityExampleInfoMapper::mapEntityToBean).collect(Collectors.toList());
    }

}
