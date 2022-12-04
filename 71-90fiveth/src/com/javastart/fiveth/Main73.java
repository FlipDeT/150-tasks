package com.javastart.fiveth;

public class Main73 {
    public static void main(String[] args) {
        String firstString = "";
        String secondString = "";

        if (firstString.length() == 0) {
            firstString = "#";
        }
        if (secondString.length() == 0) {
            secondString = "#";
        }

        System.out.println(firstString.substring(0,1)+secondString.substring(secondString.length()-1,secondString.length()));
    }
}
