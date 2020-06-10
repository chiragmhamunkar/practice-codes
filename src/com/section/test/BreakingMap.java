package com.section.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

public class BreakingMap {
    public static void testIt(Map<Integer, Integer> map) throws InterruptedException {
        IntStream.range(0, 2000).parallel().forEach(i -> map.put(i, -1));
        System.out.println(map.size());
    }

    public static void main(String[] args) throws InterruptedException {
        testIt(new HashMap<>());
        testIt(new ConcurrentHashMap<>());
    }
}
