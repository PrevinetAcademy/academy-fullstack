package it.previnet.academy.fullstack.bean.request;

import javax.ws.rs.QueryParam;

public class ExampleSearch {
    @QueryParam("token")
    private Long token;

    public Long getToken() {
        return token;
    }

    public void setToken(Long token) {
        this.token = token;
    }
}
