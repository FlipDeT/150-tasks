package com.javastart.seventh;

public class Main121 {
    public static void main(String[] args) {
        int [] arr = {8, 7, 6, 5, 4, 3, 2, 1, 0};
        int memory;
        for (int i = 0; i < arr.length/2; i++) {
                memory = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = memory;
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        }
    }
