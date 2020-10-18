package com.cg.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.append( 56 );
        list.append( 30 );
        list.append( 70 );
        list.popLast();
        list.show();
    }
}
