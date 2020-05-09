package SuperheroCoursework.com.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@Slf4j
@Data
public class DataSourceConfig {

        @Autowired
        private Environment env;

        @Bean(name = "customDataSource")
        @ConfigurationProperties("spring.datasource")
        public DataSource customDataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setUrl(env.getProperty("spring.datasource.hikari.jdbc-url"));
            dataSource.setUsername(env.getProperty("spring.datasource.hikari.username"));
            dataSource.setPassword(env.getProperty("spring.datasource.hikari.password"));

            return dataSource;

    }
}

