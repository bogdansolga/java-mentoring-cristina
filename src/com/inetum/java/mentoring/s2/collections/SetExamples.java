package com.inetum.java.mentoring.s2.collections;

import com.inetum.java.mentoring.model.Product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExamples {

    public static void main(String[] args) {
        Set<Product> productSet = new HashSet<>();
        productSet.add(new Product(20, "Cookie"));
        productSet.add(new Product(20, "Cookie"));
        System.out.println(productSet.size());

        // creates an immutable set
        Set<Product> setOfOne = Set.of(new Product(20, "Something else"));

        final Iterator<Product> iterator = productSet.iterator();
        while (iterator.hasNext()) {
            final Product next = iterator.next();
            if (next.getId() > 10) {
                iterator.remove();
            }
        }
    }
}
