package com.javastart.fiveth;

public class Main85 {
    public static void main(String[] args) {
        String string = "Hooh this is good";
        String [] words = string.split(" ");
        if (words[0].equals("Hooh")) {
            System.out.println(true);
        } else System.out.println(false);
    }
}
