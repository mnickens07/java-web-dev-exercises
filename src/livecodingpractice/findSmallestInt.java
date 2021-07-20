package livecodingpractice;

public class findSmallestInt {

    public static void main(String[] args) {
        int [] testArr={1,3,5,6,-2,6,0};
        System.out.println(findSmallestInt(testArr));
    }

    static int findSmallestInt(int[] intArr){
        int smallestInt=intArr[0];
        for(int i = 0; i<intArr.length-1; i++) {
            if(intArr[i]<smallestInt){
                smallestInt=intArr[i];
            }
        }
        return smallestInt;
    }


}
