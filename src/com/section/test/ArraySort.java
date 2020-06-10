package com.section.test;

public class ArraySort {
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 2, 6, 3, 8, 0};
        int[] sorted = sort(a);
        for(int x: sorted)
            System.out.print(x + " ");
        System.out.println();
    }

    private static int[] sort(int[] a) {
        int[] freq = new int[10];
        for(int x: a)
            freq[x] += 1;
        int[] sorted = new int[a.length];
        int j = 0;
        for(int i = 0; i != freq.length; ++i){
            while(freq[i] > 0 && j < sorted.length){
                sorted[j] = i;
                freq[i] -= 1;
                j += 1;
            }
        }

        return sorted;
    }
}
