package com.javastart.eighth;

import java.util.ArrayList;

public class Main135 {
    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 2, 2, 4, 5, 5, 6, 8, 8, 9, 9};
        ArrayList <Integer> newArr= new ArrayList<>();
        newArr.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                newArr.add(arr[i]);
            }
        }
        System.out.println(newArr);
    }
}
