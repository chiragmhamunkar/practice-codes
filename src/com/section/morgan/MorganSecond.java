package com.section.morgan;

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class MorganSecond {
    public static final int MAX_QUEUE_SIZE = 3;
    static class Quote{
        String symbol;
        double price;

        Quote(String symbol, double price){
            this.symbol = symbol;
            this.price = price;
        }
    }


    static class Xyz{
        public static int i = 500;

    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");
        //solve2();

        solve4();

    }

    private static void solve4() throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger();
        CountDownLatch countDownLatch = new CountDownLatch(4);
        Thread thread1 = new Thread(() -> {System.out.println(atomicInteger.incrementAndGet()); countDownLatch.countDown();});
        Thread thread2 = new Thread(() -> {System.out.println(atomicInteger.incrementAndGet()); countDownLatch.countDown();});
        Thread thread3 = new Thread(() -> {System.out.println(atomicInteger.incrementAndGet()); countDownLatch.countDown();});
        Thread thread4 = new Thread(() -> {System.out.println(atomicInteger.incrementAndGet()); countDownLatch.countDown();});
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        countDownLatch.await();
        System.out.println("Hello, world! I completed the tasks.");


    }

    private static void solve3(){
        Xyz xyz = null;
        System.out.println(xyz.i);
    }

    private static void solve2(){

        int[] input = {0, 7, 8, 3, 2 , 2, 1, 1, 1};
        int[] freq = new int[10];

        for(int x: input)
            freq[x] += 1;
        for(int i= 0; i != 10; ++i){
            while(freq[i] > 0){
                System.out.print(i + " ");
                freq[i] -= 1;
            }
        }
        System.out.println();

    }

    private static void solve1(){
        Map<String, Queue<Double>> map = new HashMap<>();

        List<Quote> quotes = Arrays.asList(new Quote("APPL", 10), new Quote("APPL", 20), new Quote("APPL", 30), new Quote("APPL", 40));
        for(Quote quote: quotes){
            if(!map.containsKey(quote.symbol)){
                map.put(quote.symbol, new LinkedList());
            }
            Queue<Double> queue = map.get(quote.symbol);
            if(queue.size() == MAX_QUEUE_SIZE)
                queue.remove();
            queue.add(quote.price);

        }

        System.out.println(map);
    }
}
