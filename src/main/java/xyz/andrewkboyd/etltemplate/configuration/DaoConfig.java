package xyz.andrewkboyd.etltemplate.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xyz.andrewkboyd.etltemplate.dao.interfaces.LatestNumbersDAO;
import xyz.andrewkboyd.etltemplate.dao.postgresql.LatestNumbersImpl;

@Configuration
public class DaoConfig {

    @Bean
    LatestNumbersDAO getPostgresqlLatestNumber(){
        return new LatestNumbersImpl();
    }
}
