package com.live.springmvc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年07月21日 14:37
 * @version: 1.0
 */
@ConfigurationProperties(prefix = "spring.encrypt")
@Component
public class EncryptProperties {
    private final static String DEFAULT_KEY = "www.itboyhub.com";
    private String key = DEFAULT_KEY;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}