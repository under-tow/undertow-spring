package io.github.undertow.springframework.bean.support;

import io.github.undertow.springframework.bean.config.BeanDefinition;

import java.util.HashMap;

public abstract class AbstractBeanDefinitionReader implements IBeanDefinitionRegister{

    private HashMap<String,BeanDefinition> beanDefinitionMap = new HashMap();

    @Override
    public void register(String beanName, BeanDefinition beanDefinition) {
        this.beanDefinitionMap.put(beanName,beanDefinition);
    }
}
