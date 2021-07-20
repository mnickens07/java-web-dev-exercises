package livecodingpractice;

public class LargestOfTwoDigits {
    public static void main(String[] args) {
        int testNum=12;
        int otherTestNum=65;
//        System.out.println()
    }

    static boolean isLargestOfTwo(Integer num){
        String[] intArray = num.toString().split("");
        if(intArray[0]==intArray[1]){
            return true;
        } else
            return false;
    }
}
