/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.mpp.config;


import org.springframework.context.annotation.Configuration;

/**
 *
 * @author larogundade
 */
@Configuration

//@EnableTransactionManagement

public class DataSourceConfig {
/*
    @Value("${portal.datasource.driverClassName}")
    private  String datasourceDriverClassName ;//="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    @Value("${portal.datasource.url}")
    private  String datasourceUrl;//="jdbc:sqlserver://localhost;databaseName=school_portal;portNumber=1433";
    @Value("${portal.datasource.username}")
    private  String datasourceUsername;//="school_portal";
    @Value("${portal.datasource.password}")
    private  String datasourcePassword;//"Password1$";
    @Value("${portal.datasource.max.connection.pool.size}")
    private int maxPoolSize;
    
    @Bean(name = "DS")
    public DataSource datasource() throws IOException {
        final HikariDataSource ds = new HikariDataSource();
        ds.setDriverClassName(this.datasourceDriverClassName);
        ds.setJdbcUrl(this.datasourceUrl);
        ds.setUsername(this.datasourceUsername);
        ds.setPassword(this.datasourcePassword);
        ds.setMaximumPoolSize(this.maxPoolSize);

        return ds;
    }
    */
}