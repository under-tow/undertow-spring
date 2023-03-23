package io.github.undertow.springframework.bean.factory;

/**
 * BeanFactory接口 声明获取Bean的方式
 */
public interface IBeanFactory {
    Object getBean(String beanName);

    Object getBean(String beanName, String... args);

    <T> T getBean(String beanName, Class<T> type);
}
