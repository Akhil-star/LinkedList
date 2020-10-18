package com.cg.linkedlist;

public class LinkedList<T> {

    MyNode head;

    
    public void add(T data){
        MyNode node = new MyNode(data);
        node.data = data;
        node.next = null;
        node.next=head;
        head = node;

    }

    public void show(){
        MyNode node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

