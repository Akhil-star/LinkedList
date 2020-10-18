package com.cg.linkedlist;

public class MyNode<T extends Comparable<T>>  {

     T data;
     MyNode next;

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

    public T getData() {
        return data;
    }

    public void setData() {
       this.data=data;
    }

}
