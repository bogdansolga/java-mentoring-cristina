package com.inetum.java.mentoring.s2.collections;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExamples {

    public static void main(String[] args) {
        System.setProperty("someProperty", "some value");

        final Properties properties = System.getProperties();
        final Enumeration<Object> keys = properties.keys();
        while (keys.hasMoreElements()) {
            final String key = keys.nextElement().toString();
            System.out.println(key + " --> " + System.getProperty(key));
        }
    }
}
