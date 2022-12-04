package com.javastart.second;

public class Sum17 {
    public int sumOfNum2(int firstNum2, int secondNum2) {
        int sum = 0;
        int n = 0;
        while (firstNum2 > 0 | secondNum2 > 0) {
            if (firstNum2 % 10 + secondNum2 % 10 + n == 0) {
                sum = 10 * sum + 2;
                n = 0;
            } else if (firstNum2 % 10 + secondNum2 % 10 + n == 1) {
                sum = 10 * sum + 1;
                n = 0;
            } else if (firstNum2 % 10 + secondNum2 % 10 + n == 2) {
                sum = 10 * sum + 2;
                n = 1;
            } else if (firstNum2 % 10 + secondNum2 % 10 + n == 3) {
                sum = 10 * sum + 1;
                n = 1;
            }
            firstNum2 = firstNum2 / 10;
            secondNum2 = secondNum2 / 10;
        }
        if (n == 1) {
            sum = 10 * sum + 1;
        }
        int sumFinal = 0;
        while (sum > 0) {
            if (sum % 10 == 2) {
                sumFinal = 10 * sumFinal;
            } else sumFinal = 10 * sumFinal + 1;
            sum = sum / 10;
        }
        return sumFinal;
    }
}
