package io.github.undertow.springframework.context;

import io.github.undertow.springframework.bean.support.XmlBeanDefinitionReader;

public class XmlApplicationContext {


    private String location;


    public XmlApplicationContext(String location) {
        this.location = location;
    }

    private void refresh(){
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader();

    }

}
