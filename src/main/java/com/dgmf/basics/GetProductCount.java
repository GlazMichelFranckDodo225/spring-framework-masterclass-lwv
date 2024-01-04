package com.dgmf.basics;

// Any Import related to DummyProductDao or JdbcProductDao to
// achieved 100% Loose Coupling ==> Application depends on Interface
// Type and not on Implementations
// At the Runtime, Spring Container will resolve Dependencies
import com.dgmf.basics.annotationbasedconfig.AppJavaBasedConfig;
import com.dgmf.basics.dao.ProductDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GetProductCount {
    public static void main(String[] args) {
        // Dependencies
        ProductDao dao;
        ProductDao dao2;

        // Instance of Spring IoC
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        AppJavaBasedConfig.class
                );

        // Retrieving Beans from Spring Context
        // dao = context.getBean("dummyProductDao", ProductDao.class);
        dao = context.getBean("jdbcProductDao", ProductDao.class);
        dao2 = context.getBean("jdbcProductDao", ProductDao.class);

        System.out.println("================== ");

        // Outputs
        System.out.println("Dao is an Instance of : "
                + dao.getClass().getName());
        System.out.println("There are " + dao.count() + " Products");

        // Verify Singleton Profile used by default by Spring IoC
        System.out.println("Verify Singleton Profile used by default by " +
                "Spring IoC\n" +
                "dao == dao2 is " + (dao == dao2));



        context.close();
    }
}