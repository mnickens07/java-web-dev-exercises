package livecodingpractice;

public class ConcatString {
    public static String getWord(String left, String right) {
        String finalString=left.substring(0,1).toUpperCase()+left.substring(1)+right;
        return finalString;
    }

    public static void main(String[] args) {
        System.out.println(getWord("con","catenate"));
    }
}
