package com.section.test;

import java.io.IOException;

public class MethodOveridingTest {
    static class Parent{
        void say() throws IOException{

        }
    }

    static class Child extends Parent{
        @Override
        void say(){

        }
    }

}

/***
 * 1. if parent method is throwing an exception of a runtime exception, then child can throw any runtime exception(it could be sibling exception also) OR child can not throw any exception also
 * but it can not throw any checked exception e.g IOException
 *
 * 2. if parent method is throwing any checked exception, then child method can throw(not mandatory) the same or any children exception. But it should not throw any parent exception
 * if parent is throwing Exception, then child can throw RuntimeException also cause RuntimeException is child of Exception
 *
 *
 *
 * private < default < protected < public  (private is more restrictive)
 *
 *if parent class has a method with private access modifier, and child class has a method with same name then it's not method overriding cause parent method is not visible only outside of class
 * so if you have used @Override annotation then compiler will tell you that it's not valid
 */
