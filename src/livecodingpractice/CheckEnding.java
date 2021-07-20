package livecodingpractice;

public class CheckEnding {

    public static boolean checkEnding(String str1, String str2) {
        if(str2.equals(str1.substring(str1.length()-str2.length()))){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkEnding("this", "this"));
    }

}
