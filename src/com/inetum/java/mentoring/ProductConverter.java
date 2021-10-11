package com.inetum.java.mentoring;

import com.inetum.java.mentoring.model.Product;

import java.util.List;

public class ProductConverter extends AbstractProductConverter<Product, String> {

    @Override
    public String convertInput(Product product) {
        return null;
    }

    @Override
    public Product convertOutput(String s) {
        return null;
    }

    public static <Type> void display(List<Type> items) {
        // perform any operation on the items
    }
}
