package io.github.undertow.springframework.bean.factory;

/**
 * 复制生产Bean
 */
public class DefaultListBeanFactory implements IBeanFactory {

    @Override
    public Object getBean(String beanName) {
        return null;
    }

    @Override
    public Object getBean(String beanName, String... args) {
        return null;
    }

    @Override
    public <T> T getBean(String beanName, Class<T> type) {
        return null;
    }

    public Object createBean(String beanName){
        // 读取Bean定义

        // 根据代理来生产Bean

        // 注册Bean

        // 实现拓展接口

        return null;
    }
}
