package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void findArea() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        try {
            boolean keepLooping = true;
            while (keepLooping) {
                double radius = input.nextDouble();


                if (radius < 0) {
                    System.out.println("Error. You must enter a positive number.");
                } else {
                    double area = Circle.getArea(radius);
                    System.out.println("The area of the circle of radius " + radius + " is " + area);

                    keepLooping = false;
                }
            }
        } catch(Exception error){
            System.err.println("You must provide a numeric input.");

        }
        input.close();
    }
}