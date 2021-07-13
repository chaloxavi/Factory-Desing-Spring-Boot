package com.gonzalo.factory_desing.service;

import com.gonzalo.factory_desing.factory.ServiceStrategy;
import org.springframework.stereotype.Component;

@Component("serviceC")
public class ServiceC implements ServiceStrategy {
    @Override
    public String getText() {
        return "ServiceC";
    }
}
