package com.section.unknown;

public class Test {
    static int total = 10;
    public void call() {
        int total = 5;
        System.out.println(this.total);
    }
    public static void main(String[] args) {
        Test a1 = new Test();
        a1.call();

        Runtime.getRuntime().totalMemory();
        Runtime.getRuntime().freeMemory();
        Runtime.getRuntime().maxMemory();
    }
}
