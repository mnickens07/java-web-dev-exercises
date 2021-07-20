package livecodingpractice;

import java.util.Arrays;

public class Isogram {

    public static void main(String[] args) {
        String testWord="dbsagbgagggaaa";
        System.out.println(longestSubString(testWord));
    }

    static boolean isIsogram(String maybeIsogram){
        char[] strArray=maybeIsogram.toCharArray();
        Arrays.sort(strArray);
        for(int i = 0; i<maybeIsogram.length()-1; i++){
            if(strArray[i]==strArray[i+1]){
                return false;
            }
        }
        return true;
    }

    static int longestSubString(String str) {

        int finalString = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                finalString++;
            } else {
                finalString = 1;
            }
        }
        return finalString;
    }
}

