package com.javastart.eighth;

public class Main143 {
    public static void main(String[] args) {
        int [] first = {1, 2, 6, 9, 10};
        int firstIndex = 0;
        int secondIndex = 0;
        int [] second = {2, 3, 6, 8, 11};
        int [] fin = new int[first.length+second.length];
        for (int i = 0; i < fin.length-2; i++){
            if (first[firstIndex] > second[secondIndex]) {
                fin[i] = second[secondIndex];
                secondIndex++;
            } else {
                fin[i] = first[firstIndex];
                firstIndex++;
            }
        System.out.print(fin[i]+" ");
        }
        if (first[firstIndex] > second[secondIndex]) {
            fin[fin.length-2] = second[secondIndex];
            fin[fin.length-1] = first[firstIndex];
        } else {
            fin[fin.length-2] = first[firstIndex];
            fin[fin.length-1] = second[secondIndex];
        }
        System.out.print(fin[fin.length-2]+" "+fin[fin.length-1]);
    }
}
