package com.section.test;

import java.util.Arrays;
import java.util.List;

public class ReverseLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node one = new Node(1, new Node(2, new Node(3, new Node(4, null))));
        iterate(one);
        Node node = reverse(one);
        iterate(node);
    }

    private static Node reverse(Node cur) {
        if(cur == null)return cur;
        Node prev = null;
        Node next = cur.next;
        while(next != null){
            cur.next = prev;
            prev = cur;
            Node nextNext = next.next;
            next.next = cur;
            cur = next;
            next = nextNext;

        }
        return cur;


    }

    private static void iterate(Node one) {
        while(one != null){
            System.out.print(one.data + " ");
            one = one.next;
        }
        System.out.println();
    }

}
