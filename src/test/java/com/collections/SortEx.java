package com.collections;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortEx {

    @Test
    public void sortex(){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("T");
        arr.add("S");
        arr.add("Q");
        arr.add("R");
        arr.add("P");

        //using com sort()
       /* System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);*/

        //using stream
        /*System.out.println(arr);
        List<String> sorted = arr.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);*/


        //******Reverse******
        System.out.println(arr);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);

        //****Strem---
        System.out.println(arr);
        arr.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(arr);
    }
}
