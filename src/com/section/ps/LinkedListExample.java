package com.section.ps;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    static class Node{
        int number;
        Node next;

        Node(int number, Node next){
            this.number = number;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        System.out.println("hello");
        Node node = new Node(1, new Node(2, new Node(3, new Node(4, null))));
        print(node);

        Node nThNode = findNth(node, 3);
        System.out.println(nThNode.number); //2

        nThNode = findNth(node, 2);
        System.out.println(nThNode.number); //3
    }

    public static Node findNth(Node node, int n){
        Node first = node;
        Node second = node;

        int i = 1;
        while(i < n){
            ++i;
            second = second.next;
        }

        //System.out.println(second.number);

        while(second.next != null){
            second = second.next;
            first = first.next;
        }

        //System.out.println(first.number);
        return first;

    }

    private static void print(Node node) {
        while(node != null){
            System.out.print(node.number + " ");
            node = node.next;
        }
        System.out.println();
    }

}
