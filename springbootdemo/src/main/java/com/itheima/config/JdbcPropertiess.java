package com.itheima.config;

import lombok.Data;

@Data
public class JdbcPropertiess {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
