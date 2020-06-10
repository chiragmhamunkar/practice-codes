package com.section.test;

public class PassByValueTest {
    static  class Person{
        String name;
    }
    public static void main(String[] args) {
        String s = "original";
        System.out.println(s);
        update(s);
        System.out.println(s);

        Person p = new Person();p.name = "Chirag";
        System.out.println(p);
        System.out.println(p.name);
        update(p);
        System.out.println(p.name);

    }

    private static void update(String s) {
        //s = "updated";
        s = null;
    }

    private static void update(Person p) {
        //s = "updated";
        System.out.println(p);
        p.name = null;
    }
}
