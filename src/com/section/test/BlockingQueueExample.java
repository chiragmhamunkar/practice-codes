package com.section.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


/*
*
* https://stackoverflow.com/questions/2536692/a-simple-scenario-using-wait-and-notify-in-java#:~:text=The%20wait()%20and%20notify,size%20backing%2Dstore%20of%20elements.
*
* */
public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(2);
        blockingQueue.put(1);
        blockingQueue.take();
    }
}
