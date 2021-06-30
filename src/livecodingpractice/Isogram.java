package livecodingpractice;

import java.util.Arrays;

public class Isogram {

    public static void main(String[] args) {
        String testWord="thumbscrewjapingly";
        System.out.println(isIsogram(testWord));
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

}

