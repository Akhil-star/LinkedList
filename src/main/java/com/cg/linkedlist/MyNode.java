package com.cg.linkedlist;

public class MyNode<T> {

    private T data;
    private MyNode next;

    public MyNode(T data){
        this.data=null;
        this.next=null;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
