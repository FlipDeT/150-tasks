package com.javastart.third;

public class Main39 {
    public static void main(String[] args) {
        int kinder = 0;
        for (int lvl1 = 1; lvl1 < 5; lvl1++) {
            for (int lvl2 = 1; lvl2 < 5; lvl2++) {
                    for (int lvl3 = 1; lvl3 < 5; lvl3++) {
                        if ((lvl3 != lvl1) && (lvl3 != lvl2)&&(lvl2 != lvl1)) {
                            kinder++;
                            System.out.println(kinder+") "+(lvl1*100 + lvl2*10 + lvl3));
                    }
                }
            }
        }
    }
}
