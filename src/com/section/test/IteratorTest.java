package com.section.test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class IteratorTest {
    public static void main(String[] args) {
        //failFastListExample();
        //failFastHashMapExample();
        failSafeMapExample();


    }

    private static void failSafeMapExample() {
        Map<String, String> map = new ConcurrentHashMap<>();
        map.put("name", "chirag");
        map.put("mob", "1234");

        //overriding a value for existing key, doesn't fail
        for(String key: map.keySet()){
            System.out.println(key + " " + map.get(key));
            map.put("name", "sahil");
        }

        System.out.println("**********");
        //but creating a new key, fails
        for(String key: map.keySet()){
            System.out.println(key + " " + map.get(key));
            map.put("key", "234");
        }
        System.out.println(map);
    }

    private static void failFastHashMapExample() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "chirag");
        map.put("mob", "1234");

        //overriding a value for existing key, doesn't fail
        for(String key: map.keySet()){
            System.out.println(map.get(key));
            map.put("name", "sahil");
        }

        //but creating a new key, fails
        for(String key: map.keySet()){
            System.out.println(map.get(key));
            map.put("key", "234");
        }
    }

    public static void failFastListExample(){
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);

        //This will fail
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            list.add(3);
        }

        //This will fail too
        for(int i : list){
            System.out.println(i);
            list.add(3);
        }
    }
}
