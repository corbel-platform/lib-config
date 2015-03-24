/*
 * Copyright (C) 2013 StarTIC
 */
package com.bq.oss.lib.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Importing this Spring configuration activates the standard SilkRoad configuration mechanism:
 *
 * - First load properties in classpath:${conf.namespace}/defaults.properties<br />
 * - Then load properties in classpath:environment.properties<br />
 * - Local system properties override configuration in files<br />
 *
 * @author Alexander De Leon
 *
 */
@Configuration
@PropertySource(value = "classpath:${conf.namespace}/defaults.properties")
@PropertySource(value = "classpath:/environment.properties", ignoreResourceNotFound = true)
@PropertySource(value = "classpath:${conf.namespace}/version.properties", ignoreResourceNotFound = true)
public class ConfigurationIoC {

    @Bean
    public static PropertySourcesPlaceholderConfigurer myPropertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        placeholderConfigurer.setLocalOverride(true);
        placeholderConfigurer.setNullValue("@null");
        return placeholderConfigurer;
    }

}