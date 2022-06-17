package com.collections;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.ListIterator;

public class LisIteEx {

    @Test
    public void listEx(){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("T");
        arr.add("S");
        arr.add("Q");
        arr.add("R");
        arr.add("P");

        ListIterator<String> litr = arr.listIterator();
        System.out.println("forward---");
        while (litr.hasNext()){

            System.out.print(litr.next()+" ");
        }

        System.out.println("--Backward itr--");
        while (litr.hasPrevious()){
            String pr = litr.previous();
            System.out.println(pr);
        }
    }
}
