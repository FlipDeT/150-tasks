package com.javastart.fourth;

public class Main56 {
    public static void main(String[] args) {
        int k = 0;
        int x = 5;
        int y = 20;
        int p = 3;

        for (int i = x; i <= y; i++){
            if (i%p == 0){
                k++;
            }
        }

        System.out.println(k);
    }
}
