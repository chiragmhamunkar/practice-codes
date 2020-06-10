package com.section.test;

import java.util.Objects;

public class ErrorTest {
    public static void main(String[] args) {
        try {
            print(null);
            System.out.println("success");
        }catch (Exception e){
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }
    }

    public static Object print(Object object){
        if(Objects.nonNull(object)) {
            System.out.println(object);
            return object;
        }else{
            throw new Error("chirag");
        }
    }
}
