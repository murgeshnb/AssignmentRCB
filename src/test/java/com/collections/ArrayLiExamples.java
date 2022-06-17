package com.collections;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLiExamples {

    @Test
    public void constr(){
//        ArrayList<Object> arr = new ArrayList<>();
//        arr.add("A");
//        arr.add("B");
//        arr.add("C");
//        arr.add("D");
//
//        System.out.println(arr);
//
//        ArrayList<Object> arr2 = new ArrayList<>();
//        arr2.add("E");
//        arr2.add("F");
//        arr2.add("G");
//        arr2.add("H");


//        arr.addAll(2,arr2);
//        System.out.println(arr);
//
//        arr2.remove(0);
//        System.out.println(arr2);
//
//        arr2.remove("F");
//        System.out.println(arr2);

 //       arr.replaceAll(());
//
//        System.out.println(arr2);
//
//        arr2.set(0,"Z");
//        System.out.println(arr2);
//
//        Assert.assertTrue(arr2.contains("Z"));
//
//        System.out.println(arr2.indexOf("Z"));
//        System.out.println();arr2.lastIndexOf("F");

        ArrayList<String> arr3 = new ArrayList<>();
        arr3.add("M");
        arr3.add("N");
        arr3.add("O");
        arr3.add("P");

        Iterator<String> itr = arr3.iterator();

        /*while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Iterator<Object> itr2 = arr3.iterator();
        itr2.forEachRemaining(a -> System.out.println(a));*/

        while (itr.hasNext()){
            String nxt = itr.next();
            if(nxt.equals("M")){
                itr.remove();
            }
        }

        System.out.println(arr3);
    }
}
