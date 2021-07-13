package com.gonzalo.factory_desing.factory;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ServiceFactory {

    @Autowired
    BeanFactory bf;

    @Value("${service.select.value}")
    String nameService;

    @Bean
    public ServiceStrategy serviceStrategy() {
        try {
            ServiceStrategy strategy = bf.getBean(nameService, ServiceStrategy.class);
            return strategy;
        } catch (Exception e) {
            throw new NoSuchBeanDefinitionException("Unsupported requester " + nameService);
        }
    }

}
