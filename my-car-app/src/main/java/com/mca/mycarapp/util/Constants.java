package com.mca.mycarapp.util;

public final class Constants {
    private Constants(){
    }

    public static final class ConfigConstants{
        public static final String APP_PROPERTIES = "classpath:application.properties";
        public static final String REPOSITORY_LOCATION = "com.mca.mycarapp.repository";
        public static final String DB_URL = "database.url";
        public static final String DB_USERNAME = "database.username";
        public static final String DB_PASSWORD = "database.password";
        public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        public static final String ENTITY_MANAGER_FACTORY = "entityManagerFactory";
        public static final String HIBERNATE_DIALECT = "org.hibernate.dialect.MySQLDialect";
        public static final String MY_CAR_APP_MODELS = "com.mca.mycarapp.models";
        public static final String HIBERNATE = "hibernate.dialect";
        public static final String HIBERNATE_SHOW_SQL = "hibernate.show_sql";
        public static final String HIBERNATE_CONNECTION_AUTO_COMMIT = "hibernate.connection.autocommit";
        public static final String HIBERNATE_CONNECTION_RELEASE_MODE = "hibernate.connection.release_mode";
        public static final String HIBERNATE_USE_SQL_COMMENTS = "hibernate.use_sql_comments";
        public static final String CONTROLLERS_REST = "com.mca.mycarapp.controllers.rest";




    }

}
