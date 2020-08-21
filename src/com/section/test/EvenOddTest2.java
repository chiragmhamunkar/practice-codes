package com.section.test;

public class EvenOddTest2 {
    private volatile int current = 0;
    private static final int MAX = 10;
    private Object object = new Object();

    public void printEven() throws InterruptedException {
        while(current < MAX) {
            synchronized (object) {
                while ((current & 1) == 1) { //i.e current no is ODD
                    object.wait();
                }
                System.out.println(current);
                current += 1;
                object.notify();

            }
        }
    }

    public void printOdd() throws InterruptedException {
        while(current < MAX)synchronized (object) {
            synchronized (object) {
                while ((current & 1) == 0) { //i.e current no is EVEN
                    object.wait();
                }
                System.out.println(current);
                current += 1;
                object.notify();

            }
        }
    }

    public synchronized void even() throws InterruptedException {
        while(current < MAX) {
            while ((current & 1) == 1) { //i.e current no is ODD
                wait();
            }
            System.out.println(current);
            current += 1;
            notify();
        }
    }

    public synchronized void odd() throws InterruptedException {
        while(current < MAX) {
            while ((current & 1) == 0) { //i.e current no is ODD
                wait();
            }
            System.out.println(current);
            current += 1;
            notify();
        }
    }

    public synchronized void remainder(int remainder) throws InterruptedException {
        while(current < MAX) {
            while (current%2 == remainder) { //i.e current no is ODD
                wait();
            }
            System.out.println(current);
            current += 1;
            notify();
        }
    }



    public static void main(String[] args) {
        EvenOddTest2 evenOddTest2 = new EvenOddTest2();
        new Thread( () -> {
            try {
                evenOddTest2.remainder(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread( () -> {
            try {
                evenOddTest2.remainder(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
