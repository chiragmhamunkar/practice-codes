package com.section.morgan;

public class Messager implements Runnable {
    private String messge;

    public Messager(String msg){
        this.messge = msg;
    }

    @Override
    public void run() {
        message(1); message(2);
    }

    private synchronized void message(int n){
        System.out.print(messge + "-" + n + " ");
    }

    public static void main(String[] args) {
        new Thread(new Messager("Wallace")).start();
        new Thread(new Messager("Gromit")).start();
    }
}
