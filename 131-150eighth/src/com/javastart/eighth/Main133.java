package com.javastart.eighth;

public class Main133 {
    public static void main(String[] args) {
        int [][] arr = {{7, 4, 2, 3, 1},{3, 3, 1, 5, 6},{3, 1, 3, 1, 2}, {0, 3, 1, 5, 6}, {7, 4, 3, 9, 2}};
        System.out.println(arr.length);
        int sum = 0;
        int memory = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][0];
            memory = i;
        }
        for (int i = 1; i < arr[memory].length; i++) {
            sum+=arr[memory][i];
        }
        System.out.println(sum);
    }
}
