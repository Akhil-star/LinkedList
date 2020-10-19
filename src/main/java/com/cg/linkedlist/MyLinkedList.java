package com.cg.linkedlist;

public class MyLinkedList<K extends Comparable<K>> {

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

    public void append(INode<K> newNode) {
        if (this.head == null) {
            this.head = newNode;
        } if(this.tail == null){
            this.tail = newNode;
        }else{
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(INode previousNode , INode newNode){
        INode tempNode = previousNode.getNext();
        previousNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode<K> pop(){
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public void popLast(){
        INode last =head;
        INode previousTolast = null;
        while(last.getNext() != null){
            previousTolast = last;
            last = last.getNext();

        }
        previousTolast.setNext( null );
    }

    public INode<K> search(K key) {
        INode<K> tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public boolean delete(K key) {
        if(search(key) == null)
            return false;
        INode tempNode = head;
        while (tempNode.getNext().getKey() != key) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(tempNode.getNext().getNext());;
        return true;
    }

    public int length(){
        INode node =head;
        if(head == null){
            return 0;
        }
        int count =0;
        INode current = head;
        while(current != null){
            count++;
            current = current.getNext();
        }
        return count;
    }

    public void printLinkedList() {
        INode node = head;
        while (node != null) {
            System.out.print(node);
            if (node != tail) {
                System.out.print(" -> ");
            }
            node = node.getNext();
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



/*If you know the index at which node as to be inserted
        public void insertAt(int index,K data){
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
    }*/