package com.javastart.sixth;

public class Main93 {
    public static void main(String[] args) {
        int [] arr = {10, 0, 20, 20, 20, 0};
        boolean ten = false;
        boolean twenty = false;

        for (int i = 0; i<arr.length-1; i++){
            if (arr[i] == 10 || arr[i] == 20) {
                if (arr[i] == 10 && arr[i] == arr[i+1]) {
                    ten = true;
                }
                if (arr[i]==20 && arr[i] == arr[i+1]) {
                    twenty = true;
                }
            }
        }

        if (ten && twenty) {
            System.out.println(false);
        } else if (ten) {
            System.out.println(ten);
        } else if (twenty) {
            System.out.println(twenty);
        } else System.out.println(false);
    }
}
