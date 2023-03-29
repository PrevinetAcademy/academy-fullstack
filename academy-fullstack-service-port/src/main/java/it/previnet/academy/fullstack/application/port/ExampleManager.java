package it.previnet.academy.fullstack.application.port;

import it.previnet.academy.fullstack.bean.ExampleInfo;
import it.previnet.academy.fullstack.bean.request.ExampleSearch;
import java.util.List;

public interface ExampleManager {
    
    List<ExampleInfo> fetch(ExampleSearch search);

}
