package com.javastart.seventh;

public class Main113 {
    public static void main(String[] args) {
        int [] arr1 = {1, 3, 5, 7, 9, 11};
        int [] arr2 = {0, 2, 4, 6, 8, 10};
        int [] newArr = new int[arr2.length + arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
            System.out.println(newArr[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
            System.out.println(newArr[arr1.length + i]);
        }
        for(int i = newArr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( newArr[j] > newArr[j+1] ){
                int tmp = newArr[j];
                newArr[j] = newArr[j+1];
                newArr[j+1] = tmp;
            }
        }
        }
        for (int i = 0; i < newArr.length;i++) {
            System.out.println(newArr[i]);
        }
    }
}
