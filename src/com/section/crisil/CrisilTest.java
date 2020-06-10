package com.section.crisil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CrisilTest {
    public static final int N = 10;
    //0, 0, 1, 0, 2
    //0, 0, 1, 0, 2, 0, 2, 2, 1, 6
    public static void main(String[] args) {
        System.out.println("Hello, world");
        Map<Integer, Integer> lastIndex = new HashMap<>();
        int[] seq = new int[N];
        for(int i = 0; i != N-1; ++i){
            int cur = seq[i];
            if(lastIndex.containsKey(cur)){
                int prevLastPosition = lastIndex.get(cur);
                seq[i+1] = i - prevLastPosition;
            }
            lastIndex.put(cur, i);
        }

        for(int i: seq){
            System.out.println(i);
        }
    }
}
