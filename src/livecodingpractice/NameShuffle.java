package livecodingpractice;

public class NameShuffle {
    public static void main(String[] args) {
        String testString="Marcus Nickens";
        System.out.println(nameShuffle(testString));

    }

    public static String nameShuffle(String s) {
        String[] strArr=s.split(" ");
        String finalString="";
        for(int i=0; i<strArr.length; i++) {
            finalString=strArr[1]+" "+strArr[0];
        }
        return finalString;
    }
}
