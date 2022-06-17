package com.collections;

import org.testng.annotations.Test;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayEz {

    @Test
    public void example(){
//        CopyOnWriteArrayList<String> cpy = new CopyOnWriteArrayList<String>();
//        cpy.add("A");
//        cpy.add("B");
//        cpy.add("C");
//        cpy.add("D");
//        cpy.add(1,"P");
//        cpy.addIfAbsent("E");
//
//        System.out.println(cpy);

        CopyOnWriteArrayList<String> cpy2= new CopyOnWriteArrayList<String>();
        cpy2.add("A");
        cpy2.add("B");
        cpy2.add("C");
        cpy2.add("Z");

//        cpy.addAllAbsent(cpy2);
//        System.out.println(cpy);

        cpy2.forEach(System.out::println);
    }
}
