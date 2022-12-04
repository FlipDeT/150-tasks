package com.javastart.seventh;

public class Main123 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -1, 4, 10, -25, -1, 5, 4};
        int sum = 0;
        int leftIndex = -1;
        int rightIndex = -1;
        for (int i:arr) {
            System.out.print(i+" ");
            sum += i;
        }
        System.out.println();
        int tempSum = sum;
        int minSum = sum;
        for (int i = 0; i < arr.length; i++) {
            if (tempSum - arr[i] <= minSum) {
                leftIndex = i;
                minSum = tempSum - arr[i];
            }
            tempSum -= arr[i];
        }
        System.out.println(leftIndex);
        tempSum = sum;
        minSum = sum;
        for (int i = arr.length-1; i > leftIndex; i--) {
            if (tempSum - arr[i] < minSum) {
                rightIndex = i;
                minSum = tempSum - arr[i];
            }
            tempSum -= arr[i];
        }
        minSum = 0;

        if (rightIndex == -1) {
            rightIndex = arr.length;
        }
        System.out.println("array with min sum: ");
        for (int i = leftIndex+1; i < rightIndex; i++) {
            System.out.print(arr[i]+" ");
            minSum +=arr[i];
        }
        System.out.println();
        System.out.println("sum = "+minSum);
    }
}
