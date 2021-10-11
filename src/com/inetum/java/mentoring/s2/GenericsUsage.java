package com.inetum.java.mentoring.s2;

import com.inetum.java.mentoring.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GenericsUsage {

    public static void main(String[] args) {
        List<? extends Product> products = new ArrayList<>();
    }
}
