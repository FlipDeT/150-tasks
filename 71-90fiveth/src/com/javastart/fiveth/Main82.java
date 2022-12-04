package com.javastart.fiveth;

public class Main82 {
    public static void main(String[] args) {
        int [] array = {1, 2, 7, 5, 6};
        int max = array[0];
        if (array[(array.length-1)/2] > max){
            max = array[(array.length-1)/2];
        }
        if (array[array.length-1] > max) {
            max = array[array.length-1];
        }
        System.out.println(max);
    }
}
