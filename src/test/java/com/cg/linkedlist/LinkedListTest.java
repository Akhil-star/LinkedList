package com.cg.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void given3NumbersSearchNumber() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.append( 56 );
        list.append( 30 );
        list.append( 70 );
        list.show();
        Assert.assertTrue(list.search( 30 ));
    }
    @Test
    public void testDeleteValue()
    {
        LinkedList list=new LinkedList();
        list.append(56);
        list.append(30);
        list.append(40);
        list.append(70);
        list.deleteAtPosition( 3,40 );
        list.show();
        list.length();
        Assert.assertEquals( 3, list.length());
    }
}
