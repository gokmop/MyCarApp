package com.mca.mycarapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

import java.util.Properties;

import static com.mca.mycarapp.util.Constants.ConfigConstants.*;

@Configuration
@PropertySource(APP_PROPERTIES)
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {REPOSITORY_LOCATION})
public class DbConfig {

    private final String dbUrl, dbUserName, dbPassword;

    public DbConfig(Environment environment){
        dbUrl = environment.getProperty(DB_URL);
        dbUserName = environment.getProperty(DB_USERNAME);
        dbPassword = environment.getProperty(DB_PASSWORD);
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(JDBC_DRIVER);
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUserName);
        dataSource.setPassword(dbPassword);
        return dataSource;
    }

    @Bean(name = ENTITY_MANAGER_FACTORY)
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource){
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        vendorAdapter.setDatabasePlatform(HIBERNATE_DIALECT);
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan(MY_CAR_APP_MODELS);
        factory.setDataSource(dataSource);
        factory.setJpaProperties(properties());
        return factory;
    }

    @Bean
    public PlatformTransactionManager transactionManager(){
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory(dataSource()).getObject());
        return transactionManager;
    }

    private Properties properties(){
        Properties properties = new Properties();
        properties.setProperty(HIBERNATE, HIBERNATE_DIALECT);
        properties.setProperty(HIBERNATE_SHOW_SQL, "true");
        properties.setProperty(HIBERNATE_CONNECTION_AUTO_COMMIT, "false");
        properties.setProperty(HIBERNATE_CONNECTION_RELEASE_MODE, "auto");
        properties.setProperty(HIBERNATE_USE_SQL_COMMENTS, "true");
        return properties;
    }
}
