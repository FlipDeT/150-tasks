package com.javastart.third;

import java.util.Scanner;

public class Main34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input length of side");
        int side = input.nextInt();

        System.out.println(3.0/2 * 4);
        System.out.println(3 * 4/2);

        System.out.println("Square of hexagon = "+( 3.0/ 2    *Math.sqrt(3)*  side*side));
        System.out.println("Square of hexagon = "+(6*(side*side))/(4*Math.tan(Math.PI/6)));
        System.out.println(1/Math.sqrt(3)+" "+Math.tan(Math.PI/6));
    }
}
