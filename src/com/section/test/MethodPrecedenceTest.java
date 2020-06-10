package com.section.test;

public class MethodPrecedenceTest {
    public static void main(String[] args) {
        //test(1); // --> int, long, Integer, Object..... NOTE: This will never invoke Long
        //test(1l); // --> long, Long, Object ..... NOTE: This will never invoke int, Integer
        //test(1L); // --> long, Long, Object ..... NOTE: This will never invoke int, Integer
        //test(1.0);// --> Object ...AND NOT int, Integer, long, Long
        //test(1d); // --> Object ...AND NOT int, Integer, long, Long
        test(1D);// --> Object ...AND NOT int, Integer, long, Long
    }

    public static void test(int a){
        System.out.println("int: " + a);
    }

    public static void test(long  a){
        System.out.println("long: " + a);
    }

    public static void test(Integer a){
        System.out.println("Integer: " + a);
    }



    public static void test(Long  a){
        System.out.println("Long: " + a);
    }

    public static void test(Object  a){
        System.out.println("Object: " + a);
    }


}
