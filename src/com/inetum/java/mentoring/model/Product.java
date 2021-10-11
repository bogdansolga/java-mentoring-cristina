package com.inetum.java.mentoring.model;

import java.io.Serializable;

public class Product implements Serializable {

    private final long id;
    private final String name;

    public Product(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
