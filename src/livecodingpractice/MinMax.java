package livecodingpractice;

import java.lang.reflect.Array;
import java.util.*;

public class MinMax {
    public static void main(String[] args) {
        double[] testArr1= {1,3,8.5,10,6};
        int[] testArr={1,2,5,9,-8,10};
        System.out.println(differenceMaxMin(testArr));
    }
    public static double[] minMax(double[] arr) {
        double larNum=arr[0];
        double smallNum=arr[0];

        for(int i=0; i<arr.length; i++) {
            if(larNum<arr[i]){
                larNum=arr[i];
            }
            if(smallNum>arr[i]) {
                smallNum=arr[i];
            }
        }
        double[] finalArr=new double[]{smallNum,larNum};
        return finalArr;
    }

    public static int differenceMaxMin(int[] arr) {
        int max=0;
        int min=0;
        Arrays.sort(arr);
        max=arr[arr.length-1];
        min=arr[0];
        return max-min;
    }


}