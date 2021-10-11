package com.inetum.java.mentoring.s2.collections;

import com.inetum.java.mentoring.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(10, "Sweater"));

        System.out.println(products.size());
    }
}
