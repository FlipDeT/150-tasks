package com.javastart.fiveth;

public class Main77 {
    public static void main(String[] args) {
        int [] firstArray = {1, 29, -5, 72, 10, 0};
        int [] secondArray = {-1, 29, -5, 72, 10, 0};

        int [] array = {firstArray[0], secondArray[secondArray.length-1]};
        System.out.println(array[0]+" "+ array[1]);
    }
}
