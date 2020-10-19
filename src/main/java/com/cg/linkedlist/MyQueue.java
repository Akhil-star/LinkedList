package com.cg.linkedlist;

public class MyQueue<K> {
    private final MyLinkedList myLinkedList;

    public MyQueue(){
        this.myLinkedList = new MyLinkedList();
    }
    public void enqueue(K key){
        myLinkedList.append(new MyNode(key));
    }
    public K dequeue(){
        return (K) myLinkedList.pop().getKey();
    }

    public void printQueue(){
        myLinkedList.printMyNodes();
    }
}
