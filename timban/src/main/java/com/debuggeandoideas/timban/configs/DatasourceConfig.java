package com.debuggeandoideas.timban.configs;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//@Configuration
public class DatasourceConfig {

    //@Bean
    public DataSource dataSource(){

        final var datasource = new DriverManagerDataSource();
        datasource.setDriverClassName("org.h2.Driver");
        datasource.setUrl("jdbc:h2:mem:timban");
        datasource.setUsername("sa");
        datasource.setPassword("password");

        return null;
    }
}
