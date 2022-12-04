package com.javastart.eighth;

public class Main139 {
    public static void main(String[] args) {
        int [] arr = {-10, 5, 1, 0, 2, 3, -5, -1};
        int sum = arr[0];
        int k = 0;
        int d = -1;
        while (sum != 0) {
            if (k+1 > arr.length-1){
                break;
            }
            for (int i = k+1; i < arr.length; i++) {
                sum += arr[i];
                d = i;
                if (sum == 0) break;
            }
                if (sum != 0) {
                    sum = arr[k+1];
                } else if (sum == 0) {
                    break;
                }
                k++;
        }
        if (arr[0] == 0) {
            System.out.println("[0, 0]");
        } else if (k > arr.length-1) {
            System.out.println("Not found");
        } else System.out.println("["+k+", "+d+"]");
    }
}
