package com.cg.linkedlist;

public class MyLinkedList<K> {

    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void add(INode<K> newNode){
        if(this.tail == null){
            this.tail = newNode;
        }
        if(this.head == null){
            this.head = newNode;
        }else{
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext( tempNode );
        }
    }

    public void printMyNodes(){
        System.out.println("My Nodes: "+head);
    }

    @Override
    public String toString() {
        return "LinkedListNodes{" + head + '}';
    }
}
