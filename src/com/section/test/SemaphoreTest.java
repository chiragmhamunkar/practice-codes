package com.section.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    private static Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) {
        //Semaphore semaphore = new Semaphore(2);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(() -> print());
        executorService.submit(() -> print());
        executorService.submit(() -> print());
        executorService.submit(() -> print());
        System.out.println("This is the end of the program");
        executorService.shutdown();
    }

    private static void print() {
        acquire();
        System.out.println("Thread name: " + Thread.currentThread().getName());
        sleep(5000);
        release();
    }

    private static void release() {
        semaphore.release();
    }

    private static void acquire() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw  new RuntimeException(e);
        }
    }
}
