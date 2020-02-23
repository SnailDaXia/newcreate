package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
//@Configuration
//@PropertySource("classpath:application.yml")
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {

    /*@Value("${jdbc.url}")
    String url;
    @Value("${jdbc.driverClassName}")
    String driverClassName;
    @Value("${jdbc.username}")
    String username;
    @Value("${jdbc.password}")
    String password;*/

   /* @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(){
        *//*DruidDataSource ds = new DruidDataSource();
        ds.setUrl(jdbc.getUrl());
        ds.setDriverClassName(jdbc.getDriverClassName());
        ds.setUsername(jdbc.getUsername());
        ds.setPassword(jdbc.getPassword());*//*

        return new DruidDataSource();
    }*/
}
