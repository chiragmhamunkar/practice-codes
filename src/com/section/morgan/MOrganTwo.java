package com.section.morgan;

import java.util.concurrent.atomic.AtomicInteger;

public class MOrganTwo {

    static  class Node{
        int value;
        Node next;

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void test2(){

        //1, 2, 3, 2, 1

        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);
        //Node node4 = new Node(2, null);

        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
        //node2.next = node1;
        System.out.println(isCyclic(node1));

        //System.ou


    }

    private static boolean isCyclic(Node head) {
        Node fast = head.next;
        Node slow = head;

        while(fast != null && slow != null){
            if(fast == slow){
                return true;
            }
            fast = fast.next != null ? fast.next.next: null;
            slow = slow.next;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println("Hello World");
        test2();
    }

    public static void test1(){
        int a[][] = {{1, 2, 3}, {4, 5 ,6}, {7, 8, 9}};
        int n = a.length;
        for(int i = 0; i != n; ++i){
            for(int j = 0;j != n; ++j){
                System.out.print(a[j][n-i-1] + " ");
            }
            System.out.println();
        }
    }


}

/**
 * 1, 2 , 3
 * 4, 5, 6
 * 7, 8, 9
 *
 * OP:
 * 3, 6 , 9
 * 2, 5 , 8
 * 1, 4 , 7
 *
 *
 * */
