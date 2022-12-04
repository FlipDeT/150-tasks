package com.javastart.eighth;

public class Main138 {
    public static void main(String[] args) {
        String [] strings = {"ff", "ddd", "dss"};
        int maxLength = strings[0].length();
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() > maxLength){
                maxLength = strings[i].length();
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() == maxLength) {
                System.out.println(strings[i]);
            }
        }
    }
}
