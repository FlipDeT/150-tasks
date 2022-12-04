package com.javastart.eighth;

import java.util.ArrayList;

public class Main148 {
    public static void main(String[] args) {
        ArrayList<Character> arrayList = new ArrayList<>();
        String str = "hhhhhhhhhhh";
        char [] ch = str.toCharArray();
        int uniq = -1;
        int temp = 0;
        arrayList.add(ch[0]);

        for (int i = 0; i < ch.length; i++) {
            arrayList.add(ch[i]);
        }

        for (int i = 1; i < ch.length; i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if (ch[i] == arrayList.get(j)) {
                    temp++;
                }
            }
            if (temp == 1) {
                uniq = i;
                break;
            } else temp = 0;
        }

        if (uniq !=-1) {
            System.out.println(uniq);
        } else System.out.println("not found");
    }
}
