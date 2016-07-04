package com.everydots.utils;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesUtils {

    private static final String PROPERTIES_NAME = "config.properties";

    public static void writeProperty(String key, String value) {
        String path = Thread.currentThread().getContextClassLoader()
                .getResource(PROPERTIES_NAME).getPath();
        Properties prop = new Properties();
        OutputStream output = null;
        try {
            output = new FileOutputStream(path);
            prop.setProperty(key, value);
            prop.store(output, null);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getProperty(String bucketName) {
        try {
            Properties properties = PropertiesLoaderUtils.loadProperties(new ClassPathResource(Thread
                    .currentThread().getContextClassLoader().getResource(PROPERTIES_NAME).getPath()));
            return properties.getProperty(bucketName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
