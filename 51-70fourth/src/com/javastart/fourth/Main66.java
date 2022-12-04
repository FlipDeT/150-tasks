package com.javastart.fourth;

public class Main66 {
    public static void main(String[] args) {
        int sum = 1;
        int counter = 0;
        int number = 0;

        while (counter < 100) {
            number++;
            if (number % 2 != 0) {
                if (checking(number)) {
                    sum+= number;
                }
            }
            counter++;
        }
        System.out.println(sum);
    }
    public static boolean checking (int number) {
        for (int i = 3; i*i <=number; i+=2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
