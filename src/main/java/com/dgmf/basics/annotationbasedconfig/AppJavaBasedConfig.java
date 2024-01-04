package com.dgmf.basics.annotationbasedconfig;

import com.dgmf.basics.dao.impl.DummyProductDao;
import com.dgmf.basics.dao.impl.JdbcProductDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppJavaBasedConfig {
    public AppJavaBasedConfig() {
        // Just to Trace the Application
        System.out.println("AppJavaBasedConfig Instantiated ...");
    }

    @Bean
    public DummyProductDao dummyProductDao() {
        // Just to Trace the Application
        System.out.println("dummyProductDao() Called ...");

        return new DummyProductDao();
    }

    @Scope("prototype")
    @Bean
    public JdbcProductDao jdbcProductDao() {
        // Just to Trace the Application
        System.out.println("jdbcProductDao() Called ...");

        return new JdbcProductDao();
    }
}
