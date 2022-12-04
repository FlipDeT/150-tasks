package com.javastart.fiveth;

public class Main81 {
    public static void main(String[] args) {
        int [] array = {1, 2, 4, 5, 4};
        int [] a = new int[array.length];

        a[0]=array[a.length-1];
        a[a.length-1] = array[0];

        System.out.print(a[0]+" ");
        for (int i = 1 ; i < array.length-1; i++) {
            a[i] = array[i];
            System.out.print(a[i]+" ");
        }
        System.out.println(a[a.length-1]);
    }
}
