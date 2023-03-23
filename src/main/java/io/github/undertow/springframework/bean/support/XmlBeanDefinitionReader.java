package io.github.undertow.springframework.bean.support;

import cn.hutool.core.util.XmlUtil;
import io.github.undertow.springframework.bean.BeansException;
import io.github.undertow.springframework.core.io.DefaultResourceLoader;
import io.github.undertow.springframework.core.io.IResource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.IOException;
import java.io.InputStream;

public class XmlBeanDefinitionReader extends AbstractBeanDefinitionReader{


    public void loadBeanDefinitions(String... location) throws BeansException{
        for (String s : location) {
            loadBeanDefinition(s);
        }
    }

    public void loadBeanDefinition(String location)  throws BeansException{
        DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader();
        IResource resource = defaultResourceLoader.getResource(location);
        try {
            doLoadBeanDefinition(resource.getInputStream());
        } catch (IOException e) {
            throw new BeansException("loadBeanDefinition error :",e);
        }
    }

    private void doLoadBeanDefinition(InputStream inputStream){
        Document doc = XmlUtil.readXML(inputStream);
        NodeList rootChildNodes = doc.getChildNodes();
        Element beanElement = (Element)doc.getElementsByTagName("beans").item(0);

        if(beanElement != null){
            NodeList beans = beanElement.getElementsByTagName("bean");
            for (int i = 0; i < beans.getLength(); i++) {
//                beans.item(i).getAttributes().
            }
        }


    }


}
