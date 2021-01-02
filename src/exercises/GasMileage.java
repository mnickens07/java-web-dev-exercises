package exercises;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] stuff) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        int milesTraveled = input.nextInt();
        System.out.println(" How many gallons of gas have you consumed?");
        int gallons = input.nextInt();

        System.out.println("Your car gets " + milesTraveled/gallons+" miles per gallon.");
    }
}