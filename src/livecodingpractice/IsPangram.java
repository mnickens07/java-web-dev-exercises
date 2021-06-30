package livecodingpractice;

import java.util.Arrays;

public class IsPangram {

    public static void main(String[] args) {
        String testStr="";

        System.out.println(IsPangram.isPangram(testStr));
        System.out.println(testStr);
    }

    public static boolean isPangram(String str){

        str=str.toLowerCase();

        for(char ch = 'a'; ch<='z'; ch++){
            if(!str.contains(ch+"")){
                return false;
            }
        }
        return true;
    }

}
