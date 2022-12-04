package com.javastart.fiveth;

public class Main76 {
    public static void main(String[] args) {
        int [] firstArray = {1, 29, -5, 72, 10, 0};
        int [] secondArray = {-1, 29, -5, 72, 10, 0};

        if (firstArray[0] == secondArray[0] && firstArray[firstArray.length-1] == secondArray[secondArray.length-1]) {
            System.out.println(true);
        }else System.out.println(false);
    }
}
