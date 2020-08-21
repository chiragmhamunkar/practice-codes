package com.section.test;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class EvenOddWithThreads {
    private AtomicInteger atomicInteger = new AtomicInteger();
    private static final Integer N = 10;
    private static Object object = new Object();

    public static void main(String[] args){
        EvenOddWithThreads in = new EvenOddWithThreads();
        Runnable evenRunnable = () -> {
            try {
                in.remainder(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable oddRunnable = () -> {
            try {
                in.remainder(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(evenRunnable);
        executorService.submit(oddRunnable);

        executorService.shutdown();
        System.out.println("End");

    }
    private synchronized void remainder(int rem) throws InterruptedException {
        while(atomicInteger.get() < N){
            while(atomicInteger.get()%2 == rem)
                wait();
            System.out.println(atomicInteger.get());
            atomicInteger.incrementAndGet();
            notify();
        }
    }
}
