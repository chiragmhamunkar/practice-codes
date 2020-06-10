package com.section.test;

import java.lang.reflect.Field;
import java.util.Arrays;

public class StringImmutabilityBreakTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = "chirag";
        String tp = s;
       print(s);
       Field valueField = String.class.getDeclaredField("value");
       valueField.setAccessible(true);
       char[] values = (char[]) valueField.get(s);
       values[0] = 's';
       System.out.println(values);
       System.out.println("tp: " + tp + " " + tp.hashCode());
       print(s);


       System.out.println("chirag".hashCode() + " " + "shirag".hashCode());
       System.out.println("shirag".equals(tp));

    }

    private static void print(String s) {
        System.out.println(s + " hashcode: " + s.hashCode());
        for (char c: s.toCharArray()){
            System.out.print(" " + c + "");
        }
        System.out.println();
    }
}
