package livecodingpractice;

public class ReverseOrderOfString {
    public static String reverse(final String str) {
        String[] strArr=str.split(" ");
        String reverseStr = "";
        for(int i= 0;i<str.length(); i++) {
            reverseStr = str.charAt(i)+reverseStr;
        }
        return reverseStr;
    }

    public static String altReverse(String str) {
        String finalString= new StringBuilder(str).reverse().toString();
        return finalString;
    }

    public static void main(String[] args) {
        System.out.println(reverse("Yo what up?"));
    }
}
