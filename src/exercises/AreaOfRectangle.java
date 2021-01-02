package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] stuff){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        int recLength = userInput.nextInt();

        System.out.println("What is the width of the rectangle?");
        int recWidth = userInput.nextInt();
        if(recLength==recWidth){
            System.out.println("The area of the rectangle is: "+ recLength*recWidth +" units. The rectangle is a square.");
        }else {
            System.out.println("The area of the rectangle is: " + recLength * recWidth + " units");
        }

    }
}
