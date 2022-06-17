package com.collections;

import org.testng.annotations.Test;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPractice {

    @Test
    public void gettingFL(){
        LinkedList<String> lst = new LinkedList<String>();
        lst.add("A");
        lst.add("B");
        lst.add("D");
        lst.add("C");

//        System.out.println(lst.getFirst());
//        System.out.println(lst.getLast());
//        System.out.println(lst.get(1));
//        System.out.println(lst.removeFirst());
//        System.out.println(lst.removeLast());
//        System.out.println(lst.remove(1));

//        System.out.println(lst.remove("A"));

//        System.out.println(lst.removeLastOccurrence("A"));

        Collections.sort(lst);
        System.out.println(lst);
    }
}
