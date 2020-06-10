package com.section.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolTest {
    public static void main(String[] args) {
        //Executors.
        ExecutorService executorService = Executors.newCachedThreadPool();
        int i = 1;
        while(i < 100){
            executorService.submit(() -> print());
            ++i;
        }
        System.out.println("This is the end of the program");
        executorService.shutdown();
    }

    private static void print() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        //sleep(10000);
    }

    private static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw  new RuntimeException(e);
        }
    }
}
