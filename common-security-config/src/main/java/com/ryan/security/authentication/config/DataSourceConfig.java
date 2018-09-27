package com.ryan.security.authentication.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by ryan.shen on 9/27/2018
 */

@Configuration
public class DataSourceConfig {


    @Bean
    public DataSource dataSource(DruidDBConfig dbConfig) throws Exception {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(dbConfig.getUrl());
        dataSource.setUsername(dbConfig.getUsername());
        dataSource.setPassword(dbConfig.getPassword());
        dataSource.setDriverClassName(dbConfig.getDriverClassName());

        dataSource.setInitialSize(dbConfig.getInitialSize());
        dataSource.setMinIdle(dbConfig.getMinIdle().intValue());
        dataSource.setMaxActive(dbConfig.getMaxActive().intValue());
        dataSource.setMaxWait(dbConfig.getMaxWait());
        dataSource.setTimeBetweenEvictionRunsMillis(dbConfig.getTimeBetweenEvictionRunsMillis());
        dataSource.setMinEvictableIdleTimeMillis(dbConfig.getMinEvictableIdleTimeMillis());
        dataSource.setValidationQuery(dbConfig.getValidationQuery());
        dataSource.setTestOnBorrow(dbConfig.getTestOnBorrow());
        dataSource.setTestOnReturn(dbConfig.getTestOnReturn());
        dataSource.setTestWhileIdle(dbConfig.getTestWhileIdle());
        dataSource.setPoolPreparedStatements(dbConfig.getPoolPreparedStatements());
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(dbConfig.getMaxPoolPreparedStatementPerConnectionSize().intValue());
        dataSource.setFilters(dbConfig.getFilters());
        return dataSource;
    }

}
