package io.github.undertow.springframework.core.io;

/**
 * 这个接口主要用于根据地址获取（加载） Resource
 *
 * 而Resource类中可以获取资源的InputStream供解析使用
 *
 *
 * 加载Bean定义：beanDefMaps ----> beanDefReader ---【 location(s)--> getResource ----> getInputStream 】
 * 生产Bean: createBean --> getBeanDef ---> beanDefMaps
 */
public interface IResourceLoader {

    String CLASS_PATH_PREFIX = "classpath:";

    IResource getResource(String location);
}
