package com.section.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SingletonClass {
    private volatile static SingletonClass singletonClass = null;
    private static AtomicInteger counter = new AtomicInteger(0);
    private SingletonClass(){
        sleep(10000);
        counter.incrementAndGet();
    }
    public static SingletonClass getInstanceDoubleCheck(){
        if(singletonClass == null) {
            synchronized (SingletonClass.class){
                if(singletonClass == null)
                    singletonClass = new SingletonClass();
            }

        }
        return singletonClass;
    }

    public static SingletonClass getInstance(){
        if(singletonClass == null)
            singletonClass = new SingletonClass();
        return singletonClass;
    }

    public static synchronized SingletonClass getInstanceSync(){
        if(singletonClass == null)
            singletonClass = new SingletonClass();
        return singletonClass;
    }

    public static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String args[]){
        long startTime = System.currentTimeMillis();
        System.out.println(counter.get());
        ExecutorService executorService = Executors.newFixedThreadPool(100);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down");
            System.out.println(counter.get());
            System.out.println("Took " + (System.currentTimeMillis() - startTime) + " ms.");
        }));
        for(int i = 0; i != 1000; ++i){
            executorService.submit(() -> SingletonClass.getInstanceDoubleCheck());
        }
        executorService.shutdown();


    }

}
