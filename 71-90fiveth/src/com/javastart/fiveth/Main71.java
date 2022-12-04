package com.javastart.fiveth;

import javafx.beans.binding.StringBinding;

public class Main71 {
    public static void main(String[] args) {
        StringBuilder first = new StringBuilder("five");
        StringBuilder second = new StringBuilder("six");

        System.out.println(first.delete(0,1).append(second.delete(0, 1)));
        System.out.println(first);
        System.out.println(second);

    }
}
