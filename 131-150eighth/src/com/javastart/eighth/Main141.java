package com.javastart.eighth;

import java.util.ArrayList;

public class Main141 {
    public static void main(String[] args) {
        String st = "qwerty";
        char[] ch = st.toCharArray();
        ArrayList <Character> arrayList = new ArrayList<>();
        arrayList.add(ch[0]);
        boolean check = true;
        for (int i = 1; i < ch.length; i++) {
            System.out.println(ch[i]);
            for (int j = 0; j < arrayList.size(); j++){
                System.out.println(arrayList);
                if (ch[i] == arrayList.get(j)) {
                    check = false;
                    break;
                }
            }
            if (!check) {
                break;
            }
            arrayList.add(ch[i]);
        }
        System.out.println(check);
    }
}
