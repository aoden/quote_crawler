package com.tdt.crawler.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;


@Configuration
@ComponentScan(basePackages = "com.tdt.crawler")
@PropertySource("classpath:application.properties")
public class SpringBeansConfig {

    @Bean
    public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {

        PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
        configurer.setLocation(new ClassPathResource("application.properties"));
        return configurer;
    }
}
