package com.itheima.d6_generics_class;

import java.util.ArrayList;

/* loaded from: Test.class */
public class Test {
    public static void main(String[] args) {
        ArrayList<Cat> animals = new ArrayList<>();
        test(animals);
    }

    public static <T> T test(T t) {
        System.out.println((Object) null);
        return t;
    }
}