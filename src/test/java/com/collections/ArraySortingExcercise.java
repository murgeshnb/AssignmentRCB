package com.collections;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySortingExcercise {

    @Test
    public void exercise() {

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(20,"Bharat",11));
        students.add(new Student(22,"Amu",6));
        students.add(new Student(8,"Chand",14));
        students.add(new Student(22,"Doo",6));
        students.add(new Student(10,"Emm",2));

//        for (Student std:students) {
//            if(std.age>8){
//                System.out.println(std.name);
//            }
//        }

//        for (Student std:students) {
//            if(std.classNo==6){
//                System.out.println(std.name);
//            }
//        }

        //sorting students by age
        /*ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for (Student st :students) {
            arr2.add(st.age);
        }
        Collections.sort(arr2);
        System.out.println(arr2);*/

        //sorting students by Name
        /*ArrayList<String> arr2 = new ArrayList<String>();
        for (Student st :students) {
            arr2.add(st.name);
        }
        Collections.sort(arr2);
        System.out.println(arr2);*/

        //sorting students by classNo
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for (Student st :students) {
            arr2.add(st.classNo);
        }
        Collections.sort(arr2);
        System.out.println(arr2);


    }

    private static class Student{
        int age;
        String name;
        int classNo;

        public Student(int age,String name,int classNo){
            this.age=age;
            this.name=name;
            this.classNo=classNo;
        }
        
    }
}
