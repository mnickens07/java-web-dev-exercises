package livecodingpractice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reversedString=scanner.nextLine();
        System.out.println(altReverse(reversedString));
    }
    public static String reverse(String str){
        str=new StringBuilder(str).reverse().toString().toLowerCase();
        return str;
    }

    public static String altReverse(String str){
        String reversed="";
        char [] myChar=str.toCharArray();
        for (int i = 0; i<str.length(); i++){
            reversed = myChar[i] +reversed;
        }
        return reversed.toLowerCase();
    }
}
