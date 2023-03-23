package io.github.undertow.springframework.bean.support;

import io.github.undertow.springframework.bean.config.BeanDefinition;

public interface IBeanDefinitionRegister {

    void register(String beanName, BeanDefinition beanDefinition);
}
