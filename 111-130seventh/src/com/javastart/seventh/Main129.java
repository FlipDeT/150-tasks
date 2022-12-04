package com.javastart.seventh;

import java.util.ArrayList;

public class Main129 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 5, 2, 1, 9, 2, 8, 8, 3};
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(arr[0]);
        int check = 0;
        for (int i = 1; i < arr.length; i++) {
            Object o = arr[i];
            System.out.print(arr[i]+" ");
            for (int j = 0; j < arrayList.size(); j++){
                if (arrayList.get(j) == arr[i]){
                    check = 1;
                    break;
                } else if (arrayList.get(j) != arr[i]) {
                    check = 2;
                }
            }
            if (check == 1) {
                arrayList.remove(o);
            } else if (check == 2) {
                arrayList.add(arr[i]);
            }
        }
        System.out.println("\n"+arrayList);
    }
}
