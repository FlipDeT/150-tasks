package com.javastart.seventh;

public class Main122 {
    public static void main(String[] args) {
        int[] arr = {2, -1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0;
        int leftIndex = -1;
        int rightIndex = -1;
        for (int i:arr) {
            System.out.print(i+" ");
            sum +=i;
        }

        System.out.println();
        int tempSum = sum;
        int maxSum = sum;
        for (int i = 0; i < arr.length; i++) {
            if (tempSum - arr[i] > maxSum) {
                leftIndex = i;
                maxSum = tempSum - arr[i];
            }
            tempSum -= arr[i];
        }
        tempSum = sum;
        maxSum = sum;
        for (int i = arr.length-1; i > leftIndex; i--) {
            if (tempSum - arr[i] > maxSum) {
                rightIndex = i;
                maxSum = tempSum - arr[i];
            }
            tempSum -= arr[i];
        }
        maxSum = 0;

        if (rightIndex == -1) {
            rightIndex = arr.length;
        }
        System.out.println("array with max sum: ");
        for (int i = leftIndex+1; i < rightIndex; i++) {
            System.out.print(arr[i]+" ");
            maxSum +=arr[i];
        }
        System.out.println();
        System.out.println("sum = "+maxSum);
    }
}
