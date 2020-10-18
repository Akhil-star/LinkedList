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

    public void append(T data){
        MyNode node = new MyNode(data);
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }else{
            MyNode n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAt(int index,T data){
        MyNode node = new MyNode(data);
        node.data = data;
        node.next = null;
        if(index == 0){
            append( data );
        }
        MyNode n = head;
        for(int i=0;i<index-1;i++){
            n = n.next;
        }
        node.next = n.next;
        n.next=node;
    }

    public void pop(){
        head = head.getNext();
    }

    public void popLast(){
        MyNode last =head;
        MyNode previousTolast = null;
        while(last.next != null){
            previousTolast = last;
            last = last.next;
        }
        previousTolast.next = null;

    }

    public boolean search(T value){
        MyNode node = head;
        while(node != null){
            if(node.getData() == value){
                return true;
            }
            node = node.getNext();
        }
        return false;
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

