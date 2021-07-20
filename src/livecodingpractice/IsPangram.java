package livecodingpractice;

import java.util.Arrays;

public class IsPangram {

    public static void main(String[] args) {
        String testStr="abcd efghijk lmno pqr stuzvwxy";

        System.out.println(IsPangram.isPangram(testStr));
        System.out.println(testStr);
    }

    public static boolean isPangram(String str){

        str=str.toLowerCase();

        for(char c = 'a'; c<='z'; c++){
            if(!str.contains(""+c)){
                return false;
            }
        }
        return true;
    }

}
