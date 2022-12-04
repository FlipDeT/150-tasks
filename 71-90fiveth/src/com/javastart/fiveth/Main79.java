package com.javastart.fiveth;

public class Main79 {
    public static void main(String[] args) {
        int [] array = {1, 3, 8};
        int memory;
        memory = array[0];
        array[0] = array[1];
        array[1] = array[2];
        array[2] = memory;

        for (int i = 0; i<3; i++){
        System.out.print(array[i]+" ");
        }
    }
}
