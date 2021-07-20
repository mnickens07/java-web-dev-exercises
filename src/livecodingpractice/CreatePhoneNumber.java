package livecodingpractice;

public class CreatePhoneNumber {

    public static void main(String[] args) {

        System.out.println(createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0}));
    }

    public static String createPhoneNumber(int[] numbers) {
        String number1="";
        String number2="";
        String number3="";

                number1="("+numbers[0]+numbers[1]+numbers[2]+") ";
                number2=""+numbers[3]+numbers[4]+numbers[5]+"-";
                number3=""+numbers[6]+numbers[7]+numbers[8]+numbers[9];
        String phoneNum=number1+number2+number3;
        return phoneNum;
    }

//    Create a method that takes an array of 10 integers (between 0 and 9) and returns a string of those numbers formatted as a phone number (e.g. (555) 555-5555).


}
