package com.javastart.fourth;

public class Main67 {
    public static void main(String[] args) {
        String firstString = "Please help!";
        System.out.println(firstString);
        String secondString = " don't ";
        String [] thoWords = firstString.split(" ");
        String thirdString = thoWords[0] + secondString + thoWords[1];

        System.out.println(thirdString);


    }
}
