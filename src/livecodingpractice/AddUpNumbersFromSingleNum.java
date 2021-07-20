package livecodingpractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class AddUpNumbersFromSingleNum {
    public static void main(String[] args) {
        int testNum=4;
       int[] testArr={-1, 44,5,1,12,1};
       String numbers="1, 2, 18";
        System.out.println(addNums(numbers));
    }

    static int addUpNumFromSingleNum(int num){
        int sumOfNums=0;
        for(int i = 0; i<num+1; i++) {
            sumOfNums+=i;
        }
        return sumOfNums;
    }
     public static int maxInt(int[] arr) {
        int max=0;
        int maxIndex=0;
        for(int i=0; i<arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
                maxIndex=i;
            }
        }
        return maxIndex;
     }

     public static int addNums(String nums) {

        String[] intsArr=nums.split(", ");
        int total=0;
        for(int i=0; i<intsArr.length; i++) {

            total+=Integer.parseInt(intsArr[i]);
        }

        return total;
     }

    public static int maxTotal(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1]+nums[nums.length-2]
                +nums[nums.length-3]+nums[nums.length-4]+nums[nums.length-5];
    }


}
