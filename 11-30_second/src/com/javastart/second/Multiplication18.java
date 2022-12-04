package com.javastart.second;

public class Multiplication18 {
    public int multOfNum2(int firstNum, int secondNum){

        Sum17 sumOperation = new Sum17();

        int sum = 0;
        double tempSum;
        int k = 0;

        if (firstNum < secondNum) {
           int min = firstNum;
           firstNum = secondNum;
           secondNum = min;
        }

        while (secondNum > 0){
            tempSum = secondNum % 10 * firstNum * Math.pow(10,k);
            k = k + 1;
            sum = sumOperation.sumOfNum2(sum,(int)tempSum);
            secondNum = secondNum / 10;
        }
        return sum;
    }
}
