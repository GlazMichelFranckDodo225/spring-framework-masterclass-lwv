package com.dgmf.basics.annotationbasedconfig;

import com.dgmf.basics.dao.impl.DummyProductDao;
import com.dgmf.basics.dao.impl.JdbcProductDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppAnnotationBasedConfig {
    public AppAnnotationBasedConfig() {
        // Just to Trace the Application
        System.out.println("AppAnnotationBasedConfig Instantiated ...");
    }

    @Bean
    public DummyProductDao dummyProductDao() {
        // Just to Trace the Application
        System.out.println("dummyProductDao() Called ...");

        return new DummyProductDao();
    }

    @Bean
    public JdbcProductDao jdbcProductDao() {
        // Just to Trace the Application
        System.out.println("jdbcProductDao() Called ...");

        return new JdbcProductDao();
    }
}
