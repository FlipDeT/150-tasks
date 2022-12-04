package com.javastart.third;

import java.nio.charset.Charset;

public class Main40 {
    public static void main(String[] args) {
        System.out.println("List of available character sets: ");

        for (String string: Charset.availableCharsets().keySet()) {
            System.out.println(string);
        }
    }
}
