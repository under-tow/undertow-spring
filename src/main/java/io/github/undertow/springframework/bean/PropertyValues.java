package io.github.undertow.springframework.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 把BeanDefinition的属性List进行一个封装成类
 */
public class PropertyValues {

    private List<PropertyValue> propertyValueList;

    public PropertyValues(List<PropertyValue> propertyValueList) {
        this.propertyValueList = propertyValueList!=null?propertyValueList:new ArrayList<>();
    }

    public PropertyValues() {
        this(null);
    }

    public List<PropertyValue> getPropertyValueList() {
        return propertyValueList;
    }
}
