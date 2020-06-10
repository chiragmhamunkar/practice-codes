package com.section.unknown;

public class ConcurrencyExample {
    private long count;
    public void incrementCount() {
        count++;
    }
    public long getCount() {
        return this.count;
    }
    public static void main(String[] args) throws InterruptedException {
        final ConcurrencyExample ce = new ConcurrencyExample();
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    ce.incrementCount();
                }
            }, "Thread" + i).start();
        }
        Thread.sleep(5000);
        System.out.println("Final number: " + ce.getCount());
    }
}
