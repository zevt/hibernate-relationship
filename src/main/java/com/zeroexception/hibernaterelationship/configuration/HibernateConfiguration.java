package com.zeroexception.hibernaterelationship.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Viet Quoc Tran
 * on 4/15/18.
 * www.zeroexception.com
 */


@Configuration
public class HibernateConfiguration {

    @Primary
    @Bean(name = "objectMapper")
    public ObjectMapper hibernateAwareObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new Hibernate5Module());
        return mapper;
    }

//    @Bean
//    protected Module module() {
//        return new Hibernate5Module();
//    }
}
