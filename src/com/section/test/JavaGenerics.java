package com.section.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 *
 * With wild cards, you can only read
 *
 * with type parameter you can add/remove too
 */
public class JavaGenerics {

    static class A<T extends  Number>{
        T t;
    }


    public static void main(String[] args) {
        List<Integer> nos = new ArrayList<>();
        nos.add(1);
        nos.add(2);
        print(nos);
        printObject(nos);

        List<String> strings = Arrays.asList("abcd");
        //print(strings);
    }

    public static <T extends Number> void print(List<T> numbers){
        //numbers.add(new Integer(1));
        show(numbers);
    }

    static void printObject(List<? extends Object> numbers){
        //numbers.add(new Object());
        show(numbers);
    }

    private static void show(Object ob) {
        System.out.println(ob);
    }
}
