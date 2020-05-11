package SuperheroCoursework.com.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Properties;

@Configuration
@Slf4j
@Data
public class DataSourceConfig {

        @Autowired
        private Environment env;

        private static String url;
        private static String driver;
        private static Properties properties;

        @Bean(name = "customDataSource")
        @ConfigurationProperties("spring.datasource")
        public DataSource customDataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setUrl(env.getProperty("spring.datasource.hikari.jdbc-url"));
            dataSource.setUsername(env.getProperty("spring.datasource.hikari.username"));
            dataSource.setPassword(env.getProperty("spring.datasource.hikari.password"));
            dataSource.setDriverClassName(Objects.requireNonNull(env.getProperty("spring.datasource.hikari.driverClassName")));

            return dataSource;
        }

        public void setUpProperties() throws Exception {
        try {
            properties.setProperty("user", env.getProperty("spring.datasource.hikari.username"));
            properties.setProperty("pass", env.getProperty("spring.datasource.hikari.password"));
            properties.setProperty("verifyServerCertificate", "true");
            properties.setProperty("requireSSL", "false");

            url = env.getProperty("spring.datasource.hikari.jdbc-url");
            driver = env.getProperty("spring.datasource.hikari.driverClassName");
        } catch (Exception ex) {
            throw new Exception("Cannot populate correct database properties.");
        }

    }

    public Connection getConnection() throws Exception {
        try {
            setUpProperties();
            Class.forName(driver);
            return DriverManager.getConnection(url, properties);
        } catch (SQLException ex) {
            throw new SQLException("Could not connect to database.");
        }
    }
}

