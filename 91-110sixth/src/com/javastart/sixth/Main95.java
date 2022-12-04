package com.javastart.sixth;

public class Main95 {
    public static void main(String[] args) {
        String [] arrString = new String[5];
        int length = 5;

        for (int i = 0; i<length; i++) {
            arrString[i] = String.valueOf(i);
            System.out.println(arrString[i]+" ");
        }
    }
}
