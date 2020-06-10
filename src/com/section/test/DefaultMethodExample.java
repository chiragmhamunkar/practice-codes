package com.section.test;

public class DefaultMethodExample {

    interface InterfaceA{
        default void say(){
            System.out.println("hello world: InterfaceA");
        }
    }

    interface InterfaceB{
        default void say(){
            System.out.println("hello world: InterfaceB");
        }
    }

    static class Clazz implements InterfaceA, InterfaceB{
        public void say(){
            System.out.println("hello world: Clazz");
            InterfaceA.super.say();
        }
    }

    public static void main(String[] args) {
        Clazz c = new Clazz();
        c.say();
    }
}
