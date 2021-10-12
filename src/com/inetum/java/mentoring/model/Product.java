package com.inetum.java.mentoring.model;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable, Comparable<Product> {

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

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Product o) {
        return Long.compare(id, o.id);
    }
}
