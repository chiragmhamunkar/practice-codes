package com.section.morgan;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MorganTw {
    static class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        test2();

    }


    private static void test2(){
        Node head = new Node(1, new Node(2, new Node(4, new Node(5, new Node(6, null)))));
        print(head);
        insertInMiddle(head, 3);
        print(head);
    }

    private static void insertInMiddle(Node head, int data){
        int size = 0;
        Node temp = head;
        while(temp != null){
            ++size;
            temp = temp.next;
        }
        System.out.println("Size is " + size);

        // 0 1 | 2 3  -> 4/2 = 2 -> < 2
        // 0 1 2 | 3 4 -> 5/2 = 2 -> > 2
        // (size-1)/2 ->

        int mid = (size-1)/2;
        int ct = 0;
        Node temp2 = head;
        while(ct < mid){
            temp2 = temp2.next;
            ++ct;
        }
        Node insert = new Node(data, temp2.next);
        temp2.next = insert;

    }

    private static void print(Node head) {
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println();
    }


    private static void test1(){
        List<Integer> numbers = Arrays.asList(5, 6, 9, 3, 2, 11, 20, 1, 4);
        Set<Integer> lookup = numbers.stream().collect(Collectors.toSet());

        int ans = 1;
        for(int st: numbers){
            int ct = 1;
            int i = st+1;
            while(lookup.contains(i)){
                ++i;
                ++ct;
            }
            ans = Math.max(ans, ct);
        }

        System.out.println(ans);
    }
}
