package io.github.undertow.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 用于读取xml文件（但没有解析xml注册bean定义的职责，beanDefinitionReader来负责读取注册）
 */
public interface IResource {

    String CLASS_PATH_PREFIX = "classpath:";

    InputStream getInputStream() throws IOException;
}
