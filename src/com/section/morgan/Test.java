package com.section.morgan;

public class Test {
    public static  class Base{
        public final void foo(){

        }
    }

    public static class Child extends Base{

    }
    public static void main(String[] args) {
        solve(2);
        System.gc();
    }

    public static void solve(int n){
        if(n >= 0){
            solve(n-1);
        }
        System.out.print(n);
    }

    public static void badMethod(){
        throw new Error();
    }
}
