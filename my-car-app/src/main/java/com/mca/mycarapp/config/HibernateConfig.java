package com.mca.mycarapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

import static com.mca.mycarapp.util.Constants.ConfigConstants.*;
import static com.mca.mycarapp.util.Constants.ConfigConstants.DB_PASSWORD;

@Configuration
@PropertySource(APP_PROPERTIES)
@EnableTransactionManagement
public class HibernateConfig {

    private final String dbUrl, dbUserName, dbPassword;

    @Autowired
    public HibernateConfig(Environment env){
        dbUrl = env.getProperty(DB_URL);
        dbUserName = env.getProperty(DB_USERNAME);
        dbPassword = env.getProperty(DB_PASSWORD);
    }

    @Bean(name="entityManagerFactory")
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(MY_CAR_APP_MODELS);
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource= new DriverManagerDataSource();
        dataSource.setDriverClassName(JDBC_DRIVER);
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUserName);
        dataSource.setPassword(dbPassword);
        return dataSource;
    }

    private Properties hibernateProperties(){
        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty(HIBERNATE, HIBERNATE_DIALECT);
        return hibernateProperties;
    }
}
