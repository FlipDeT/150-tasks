package com.javastart.seventh;

public class Main114 {
    public static void main(String[] args) {
        String string = "abcdef";
        char[] charString = string.toCharArray();
        int k = 2;
        while (k > 0) {
            char temp = charString[0];
            for (int i = 0; i < string.length() - 1; i++) {
                charString[i] = charString[i + 1];
            }
            charString[string.length() - 1] = temp;
            k--;
        }
        for (int i = 0; i<charString.length; i++) {
            System.out.print(charString[i]);
        }
    }
}
