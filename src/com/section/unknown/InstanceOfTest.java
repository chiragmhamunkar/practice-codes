package com.section.unknown;

public class InstanceOfTest {
    public static void main(String[] args) {
        Double d = null;
        System.out.println((d instanceof Double) ? "true" : "false");

        int c = 0;
        System.out.println((0 == c++) ? "true" : "false");

        boolean b = false;
        System.out.println((b = true) ? "true" : "false");

        String e = "1";
        System.out.println(("1" != e) ? "true" : "false");

        int a = 0;
        System.out.println((a != 0) ? "true" : "false");
    }
}
