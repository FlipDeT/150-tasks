package com.javastart.sixth;

public class Main94 {
    public static void main(String[] args) {
        int [] arr = {5, 5, 6, 8, 9, 7, 0, 4, 1};
        int [] finalArr = new int[arr.length];
        int f = 0;

        while (f < arr.length) {
            for (int i = 0; i<arr.length; i++) {
                if (arr[i] % 2 !=0) {
                    finalArr[f] = arr[i];
                    f++;
                }
            }

            for (int i = 0; i<arr.length; i++){
                if (arr[i]%2==0){
                    finalArr[f] = arr[i];
                    f++;
                }
            }
        }

        for (int i = 0; i < finalArr.length; i++) {
            System.out.print(finalArr[i]+" ");
        }
    }
}
