package com.inetum.java.mentoring.s2;

import com.inetum.java.mentoring.model.Product;

public class EqualsAndHashCode {

    public static void main(String[] args) {
        Product product = new Product(20, "Something");
        System.out.println(product.hashCode());
    }
}
