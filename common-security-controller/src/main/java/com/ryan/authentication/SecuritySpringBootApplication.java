package com.ryan.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Created by ryan.shen on 9/27/2018
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,
        scanBasePackages = "com.ryan")
public class SecuritySpringBootApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SecuritySpringBootApplication.class);
    }
}
