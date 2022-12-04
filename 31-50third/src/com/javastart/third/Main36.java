package com.javastart.third;

import java.util.Scanner;

public class Main36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter latitude of first coordinate: ");
        double lat1 = Math.toRadians(input.nextDouble());
        System.out.print("enter longitude of first coordinate: ");
        double long1 = Math.toRadians(input.nextDouble());
        System.out.print("enter latitude of second coordinate: ");
        double lat2 = Math.toRadians(input.nextDouble());
        System.out.print("enter longitude of second coordinate: ");
        double long2 = Math.toRadians(input.nextDouble());

        double distance = radiusEarth() * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1)
                * Math.cos(lat2) * Math.cos(long1 - long2));
        System.out.println("Distance between this points = "+distance);
    }
    public static double radiusEarth(){
        return 6371.01;
    }
}
