package com.javastart.eighth;

import java.util.ArrayList;

public class Main149 {
    public static void main(String[] args) {
        String st1 = "qwiwq";
        String st2 = "qwiqw";
        char[] ch1 = st1.toCharArray();
        char[] ch2 = st2.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < ch1.length; i++) {
            arrayList.add(ch1[i]);
        }
        for (int i = 0; i < ch2.length; i++) {
            for (int j = 0; j < arrayList.size(); j++){
                if (ch2[i] == arrayList.get(j)) {
                    arrayList.remove(j);
                    break;
                }
            }
        }
        if (arrayList.size() == 0 && ch1.length == ch2.length) {
            System.out.println(true);
        } else System.out.println(false);
    }
}
