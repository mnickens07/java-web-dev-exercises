package livecodingpractice;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scan= new Scanner(System.in);
        int myInt = scan.nextInt();
        String phrase="";
        if(myInt%3==0&&myInt%5==0){
            phrase="fizzbuzz";
        } else if(myInt%3==0){
            phrase="fizz";
        } else if(myInt%5==0){
            phrase="buzz";
        } else {
            phrase="no fizz no buzz";
        }
        System.out.println(phrase);


    }
}
