package io.github.undertow.springframework.core.io;

import cn.hutool.core.lang.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlResource implements IResource {

    private URL url;

    public UrlResource(URL url) {
        Assert.notNull(url, "URL must not ne null");
        this.url = url;
    }

    /**
     * 根据URL获取二进制流，IO异常是这种情况普遍存在的，所以默认在接口就定义该异常
     * @return InputStream
     * @throws IOException
     */
    @Override
    public InputStream getInputStream() throws IOException {
        URLConnection connection = url.openConnection();
        try {
            return connection.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
