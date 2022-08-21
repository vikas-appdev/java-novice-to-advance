package com.gradlic.java.list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        for(int i=0; i<20; i++){
            names.add("names "+i);
        }

        for (int i=0; i<20; i++){
            System.out.println(names.get(i));
        }

        System.out.println(names.indexOf("names 4")); // In case of no match it will print -1

    }
}
