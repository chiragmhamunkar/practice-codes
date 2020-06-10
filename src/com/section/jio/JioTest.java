package com.section.jio;

public class JioTest {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String a = "chirag";
        String b = a.intern();
        System.out.println(a == b);

        String aObject = new String("chirag");
        System.out.println(aObject == a);
    }
}
