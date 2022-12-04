package com.javastart.fiveth;

public class Main78 {
    public static void main(String[] args) {
        int [] array = {7, 3};
        for (int i = 0; i<2; i++){
            if (array[i] == 7 || array[i] == 4) {
                System.out.println(true);
                break;
            } else {
                System.out.println(false);
                break;
            }
        }
    }
}
