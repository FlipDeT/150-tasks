package com.javastart.eighth;

import java.util.ArrayList;

public class Main140 {
    public static void main(String[] args) {
        ArrayList <Integer> startArr = new ArrayList<>();
        ArrayList <Integer> endArr = new ArrayList<>();
        startArr.add(1);
        startArr.add(2);
        startArr.add(8);
        startArr.add(15);
        startArr.add(17);
        endArr.add(3);
        endArr.add(6);
        endArr.add(10);
        endArr.add(18);
        endArr.add(20);
        System.out.println(startArr);
        System.out.println(endArr);
        for (int i = 0; i < startArr.size(); i++){
            if (startArr.get(i+1) < endArr.get(i)) {
            startArr.remove(i + 1);
            endArr.remove(i);
            }
        }
        System.out.println(startArr);
        System.out.println(endArr);
    }
}
