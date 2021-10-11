package com.inetum.java.mentoring.s2;

import com.inetum.java.mentoring.model.Product;

public class EqualsAndHashCode {

    public static void main(String[] args) {
        Product product = new Product(20, "Coffee");
        Product anotherProduct = new Product(20, "Coffee");
        System.out.println(product.equals(anotherProduct));
        System.out.println(product.hashCode());
    }
}
