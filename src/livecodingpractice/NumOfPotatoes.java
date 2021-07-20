package livecodingpractice;

public class NumOfPotatoes {

    public static void main(String[] args) {

        System.out.println(numOfPotatoes("potato"));
    }

    static int numOfPotatoes(String str){
        int numOfPotatoes=0;
        numOfPotatoes=str.split("potato").length-1;
        return numOfPotatoes;
    }
}
