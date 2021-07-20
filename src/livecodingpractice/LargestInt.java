package livecodingpractice;

import java.util.Scanner;

public class LargestInt {

    // Driver method
    public static void main(String[] args)
    {

        int [] intArray= {1,20,-30,5};


        System.out.println("Largest integer in the given array is " + LargestInt.largestInt(intArray));

    }


    public static int largestInt(int [] arr)
    {
        // Initialize maximum element
        int maxInt = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxInt) {
                maxInt = arr[i];
            }
        }
        return maxInt;
    }






}
