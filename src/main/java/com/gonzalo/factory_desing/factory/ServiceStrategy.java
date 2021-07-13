package com.gonzalo.factory_desing.factory;

import org.springframework.stereotype.Component;

@Component
public interface ServiceStrategy {

    public abstract String getText();
}
