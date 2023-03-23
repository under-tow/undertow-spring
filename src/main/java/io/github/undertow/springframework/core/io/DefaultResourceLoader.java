package io.github.undertow.springframework.core.io;

import java.net.MalformedURLException;
import java.net.URL;


/**
 *
 */
public class DefaultResourceLoader implements IResourceLoader {

    @Override
    public IResource getResource(String location) {
        if (location.startsWith(CLASS_PATH_PREFIX)) {
            return new ClassPathResource(location);
        }
        try {
            URL url = new URL(location);
            return new UrlResource(url);
        } catch (MalformedURLException e) {
            return new FileSystemResource(location);
        }

    }
}
