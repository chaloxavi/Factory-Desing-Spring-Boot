package com.gonzalo.factory_desing.service;

import com.gonzalo.factory_desing.factory.ServiceStrategy;
import org.springframework.stereotype.Component;

@Component("serviceB")
public class ServiceB implements ServiceStrategy {

    @Override
    public String getText() {
        return "ServiceB";
    }
}
