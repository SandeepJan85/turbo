package com.collector.gazelle.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppConfig {
    
    String livebrixBaseUrl;
    static AppConfig appconfig;
    
    public void setInstance(AppConfig appconfig) {
        AppConfig.appconfig = appconfig;
    }
    public static AppConfig getInstance() {
        return appconfig;
    }
    
    @JsonProperty
    public String getLivebrixBaseUrl() {
        return livebrixBaseUrl;
    }
    
   
}
