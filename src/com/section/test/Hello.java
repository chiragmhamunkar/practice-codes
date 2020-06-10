package com.section.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> print());
        executorService.submit(() -> print());
        executorService.submit(() -> print());
        System.out.println("This is the end of the program");
        executorService.shutdown();
    }

    private static void print() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        sleep(6000);
    }

    private static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw  new RuntimeException(e);
        }
    }


}
