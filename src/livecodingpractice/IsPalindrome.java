package livecodingpractice;

import java.util.Locale;
import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter word to be tested: ");
        Scanner scanner = new Scanner(System.in);
        String word=scanner.nextLine();
        System.out.println(isPalindrome(word));
        scanner.close();
    }

    static boolean isPalindrome(String str){
        StringBuffer stringBuffer= new StringBuffer(str);
        for(int i = 0; i<str.length(); i++){
            if(str.toLowerCase().equals(new StringBuffer(str).reverse().toString().toLowerCase())){
                return true;
            }
        }
        return false;
    }
}
