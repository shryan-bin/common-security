package com.ryan.authentication.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

/**
 * Created by ryan.shen on 9/27/2018
 */

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "entityManagerFactoryBean",
        transactionManagerRef = "transactionManager",
        repositoryImplementationPostfix = "Impl",
        basePackages = {"com.ryan"}
)
public class DataSourceJPAConfig {

    @Autowired
    @Qualifier("druidDatasource")
    private DataSource dataSource;

    @Autowired
    private JpaProperties jpaProperties;

    private Map<String, String> getVendorProperties() {
        return jpaProperties.getProperties();
    }


    @Bean("entityManagerFactoryBean")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder builder){
        return builder.dataSource(dataSource)
                .properties(getVendorProperties())
                .packages("com.ryan")
                .persistenceUnit("persistenceUnit").build();
    }

    @Bean("entityManager")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder){
        return entityManagerFactoryBean(builder).getObject().createEntityManager();
    }

    @Bean("transactionManager")
    public PlatformTransactionManager transactionManager(EntityManagerFactoryBuilder builder){
        return new JpaTransactionManager(entityManagerFactoryBean(builder).getObject());
    }
}
