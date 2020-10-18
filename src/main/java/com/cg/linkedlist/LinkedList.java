package com.cg.linkedlist;

public class LinkedList<T> {

    MyNode head;
    MyNode tail = null;

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
    public void insertAfterElement(T data,T value){
          MyNode newNode = new MyNode( value );
          //MyNode previous = new MyNode( data );
          MyNode node = head;
          while(node.next!= null) {
              if (node.getData() == data) {
                  newNode.setNext( node.getNext() );
                  node.setNext( newNode.getNext() );
              }
              tail = node;
              node = node.getNext();
          }
    }

    public void deleteAtPosition(int index,T data){
        MyNode previous = head;
        int count =1;
        while(count < index-1){
            previous = previous.next;
            count++;
        }
        MyNode current = previous.next;
        previous.next = current.next;
        current.next = null;
    }

    public int length(){
        MyNode node =head;
        if(head == null){
            return 0;
        }
        int count =0;
        MyNode current = head;
        while(current != null){
            count++;
            current=current.next;
        }
        return count;
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

