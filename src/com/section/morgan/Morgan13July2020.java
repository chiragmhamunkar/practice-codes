package com.section.morgan;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Morgan13July2020 {

    static  class Parent{
        public void show(){

        }
    }

    static class Child extends Parent{
        /*public static void show(){

        }*/ //this is not allowed
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        try{
            System.exit(0);
        }catch (Exception e){

        }finally {
            System.out.println("in finally"); //this doesn't get printed in case of System.exit(0)
        }

    }
}
