package com.inetum.java.mentoring.s2.collections;

import com.inetum.java.mentoring.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(30, "T-shirt"));
        products.add(new Product(10, "Sweater"));
        Collections.sort(products);

        // creates an immutable list
        List<Product> listOfOne = List.of(new Product(10, "Something"));

        System.out.println(products.size());
    }
}
