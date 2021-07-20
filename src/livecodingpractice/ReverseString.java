package livecodingpractice;

import java.util.Locale;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reversedString=scanner.nextLine();
        System.out.println(altReverse(reversedString));
    }
    public static String reverse(String str){
        str=new StringBuffer(str).reverse().toString().toLowerCase();
        return str;
    }

    public static String altReverse(String str){
        String reversed="";
        char [] myChar=str.toCharArray();
        for (int i = 0; i<str.length(); i++){
            reversed =myChar[i]+reversed;
        }
        return reversed.toLowerCase();
    }

    public static String reverseIt(String text) {
        String revString = new StringBuilder(text).reverse().toString();
        String finalString="";

        for(int i=0; i<text.length(); i++){
            if(revString.charAt(i)==revString.toLowerCase().charAt(i)){
                finalString+=revString.toUpperCase().charAt(i);
            }else if(revString.charAt(i)==revString.toUpperCase().charAt(i)){
                finalString+=revString.toLowerCase().charAt(i);
            }
        }
        return finalString;
    }
    public static String revers(String text) {
        String revString= new StringBuilder(text).reverse().toString();
        String finalString="";
        for(int i=0; i<revString.length(); i++) {
            if(revString.charAt(i)==revString.toLowerCase().charAt(i)) {
                finalString+=revString.toUpperCase().charAt(i);
            } else{
                finalString+=revString.toLowerCase().charAt(i);
            }
        }
        return finalString;
    }
}
