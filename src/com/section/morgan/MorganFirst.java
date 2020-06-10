package com.section.morgan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MorganFirst {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String a = new String("abc");
        System.out.println("a" + a.hashCode());
        String b = "abc";
        System.out.println("b" + b.hashCode());
        a = a + "xyz";
        System.out.println("a" + a.hashCode());
        System.out.println(a.equals(b));
        System.out.println(b.equals(a));

        Map<String, String> mp = new HashMap<>();
        mp.put(null, "val1");
        System.out.println(mp);
        mp.put(null, "val2");

        System.out.println(mp);
        List<Integer> list = new ArrayList<>();
    }
}

