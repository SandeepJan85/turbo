package com.collector.gazelle.config;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;


public class ServiceConfiguration extends Configuration {

    private AppConfig appconfig;
    
    @JsonProperty("appconfig")
    public AppConfig getAppconfig(){
        return appconfig;
    }
}
