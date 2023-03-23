package io.github.undertow.springframework.bean;

/**
 * 用于BeanDefinition的属性
 */
public class PropertyValue {

    String property;

    String value;

    public PropertyValue(String property, String value) {
        this.property = property;
        this.value = value;
    }

    public String getProperty() {
        return property;
    }

    public String getValue() {
        return value;
    }
}
