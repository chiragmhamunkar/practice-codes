package com.section.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedBlockTest {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        long started = System.currentTimeMillis();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down.");
            System.out.println("Ended in ms: " + (System.currentTimeMillis() - started));

        }));
        ExecutorService executorService = Executors.newFixedThreadPool(3);
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
