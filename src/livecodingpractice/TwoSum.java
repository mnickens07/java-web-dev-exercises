package livecodingpractice;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length; i++) {
            if(nums[i]+nums[i]==target){
                return new int[] {i, i};
            }
        }
        return new int[] {nums[0],nums[1]};
    }

    public static void main(String[] args) {
        int[] testArr={1,3,5,2};
        System.out.println(twoSum(new int[]{0,2,3,4}, 4));
    }
}
