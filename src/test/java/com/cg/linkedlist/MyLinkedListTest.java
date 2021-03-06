package com.cg.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode( 70 );
        MyNode<Integer> mySecondNode = new MyNode( 30 );
        MyNode<Integer> myThirdNode = new MyNode( 56 );
        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
        myLinkedList.add( myFirstNode );
        myLinkedList.add( mySecondNode );
        myLinkedList.add( myThirdNode );
        boolean result = myLinkedList.head.equals( myThirdNode ) &&
                myLinkedList.head.getNext().equals( mySecondNode ) &&
                myLinkedList.tail.equals( myFirstNode );
        System.out.println( myLinkedList );
        Assert.assertTrue( result );

    }

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode( 56 );
        MyNode<Integer> mySecondNode = new MyNode( 30 );
        MyNode<Integer> myThirdNode = new MyNode( 70 );
        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
        myLinkedList.append( myFirstNode );
        myLinkedList.append( mySecondNode );
        myLinkedList.append( myThirdNode );
        boolean result = myLinkedList.head.equals( myFirstNode ) &&
                myLinkedList.head.getNext().equals( mySecondNode ) &&
                myLinkedList.tail.equals( myThirdNode );
        System.out.println( myLinkedList );
        Assert.assertTrue( result );

    }

    @Test
    public void givenNumberShoudBeInsertedToLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode( 56 );
        MyNode<Integer> mySecondNode = new MyNode( 70 );
        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
        myLinkedList.append( myFirstNode );
        myLinkedList.append( mySecondNode );
        MyNode<Integer> newNode = new MyNode( 30 );
        myLinkedList.insert( myFirstNode, newNode );
        boolean result = myLinkedList.head.equals( myFirstNode ) &&
                myLinkedList.head.getNext().equals( newNode ) &&
                myLinkedList.tail.equals( mySecondNode );
        System.out.println( myLinkedList );
        Assert.assertTrue( result );

    }

    @Test
    public void givenFirstElementWhenDeletedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode( 56 );
        MyNode<Integer> mySecondNode = new MyNode( 30 );
        MyNode<Integer> myThirdNode = new MyNode( 70 );
        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
        myLinkedList.append( myFirstNode );
        myLinkedList.append( mySecondNode );
        myLinkedList.append( myThirdNode );
        myLinkedList.pop();
        boolean result = myLinkedList.head.equals( mySecondNode ) &&
                myLinkedList.tail.equals( myThirdNode );
        System.out.println( myLinkedList );
        Assert.assertTrue( result );

    }

    @Test
    public void givenLastElementWhenDeletedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode( 56 );
        MyNode<Integer> mySecondNode = new MyNode( 30 );
        MyNode<Integer> myThirdNode = new MyNode( 70 );
        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
        myLinkedList.append( myFirstNode );
        myLinkedList.append( mySecondNode );
        myLinkedList.append( myThirdNode );
        myLinkedList.popLast();
        boolean result = myLinkedList.head.equals( myFirstNode ) &&
                myLinkedList.head.getNext().equals( mySecondNode );
        System.out.println( myLinkedList );
        Assert.assertTrue( result );

    }

    @Test
    public void givenElementWhenSearchedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode( 56 );
        MyNode<Integer> mySecondNode = new MyNode( 30 );
        MyNode<Integer> myThirdNode = new MyNode( 70 );
        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
        myLinkedList.append( myFirstNode );
        myLinkedList.append( mySecondNode );
        myLinkedList.append( myThirdNode );
        boolean result = myLinkedList.search( 30 ).equals( mySecondNode );
        System.out.println( myLinkedList );
        Assert.assertTrue( result );
    }

    @Test
    public void givenNumberShoudBeInsertedAfterASpecifedNodeToLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode( 56 );
        MyNode<Integer> mySecondNode = new MyNode( 30 );
        MyNode<Integer> myThirdNode = new MyNode( 70 );
        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
        myLinkedList.append( myFirstNode );
        myLinkedList.append( mySecondNode );
        myLinkedList.append( myThirdNode );
        MyNode<Integer> newNode = new MyNode<>( 40 );
        myLinkedList.insert( mySecondNode, newNode );
        boolean result = myLinkedList.head.equals( myFirstNode ) &&
                myLinkedList.head.getNext().equals( mySecondNode ) &&
                myLinkedList.head.getNext().getNext().equals( newNode ) &&
                myLinkedList.tail.equals( myThirdNode );
        System.out.println( myLinkedList );
        Assert.assertTrue( result );
    }

    @Test
    public void givenNumberShoudBeDeletedAfterASpecifedNodeToLinkedListAndReturnSize() {
        MyNode<Integer> myFirstNode = new MyNode( 56 );
        MyNode<Integer> mySecondNode = new MyNode( 30 );
        MyNode<Integer> myThirdNode = new MyNode( 40 );
        MyNode<Integer> myFourthNode = new MyNode( 70 );
        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
        myLinkedList.append( myFirstNode );
        myLinkedList.append( mySecondNode );
        myLinkedList.append( myThirdNode );
        myLinkedList.append( myFourthNode );
        myLinkedList.delete(40);
        int count = myLinkedList.length();
        System.out.println( myLinkedList );
        Assert.assertEquals( 3, count );
    }
}