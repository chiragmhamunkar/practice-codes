package com.section.test;

public class MethodOverloadingTest {
    public static void main(String[] args) {

    }

    public static int sum(int a, int b){
        return a + b;
    }


    //public static void sum(int a, int b) //this will not compile
    public static void sum(int a, String b)
    {

    }
}
