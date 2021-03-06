package com.fxptw.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


/**
 * Created by lenovo on 2017/1/16.
 */
@Component
@PropertySource(value = "classpath:/param.properties")
@ConfigurationProperties(prefix = "param")
public class ParamSettings {
    private int requesttime;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getRequesttime() {
        return requesttime;
    }

    public void setRequesttime(int requesttime) {
        this.requesttime = requesttime;
    }
}
