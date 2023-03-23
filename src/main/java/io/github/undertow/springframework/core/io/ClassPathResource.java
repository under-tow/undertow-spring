package io.github.undertow.springframework.core.io;

import java.io.InputStream;

public class ClassPathResource implements IResource{

    private final String location ;

    String CLASS_PATH_PREFIX = "classpath:";

    public ClassPathResource(String location) {
        this.location = location;
    }


    @Override
    public InputStream getInputStream() {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        return classLoader.getResourceAsStream(location);
    }
}
