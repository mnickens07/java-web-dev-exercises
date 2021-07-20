package livecodingpractice;

public class HowManyWords {
    public static void main(String[] args) {
        System.out.println(howManyWords("Hello, World! My name is Marcus."));
    }
    static int howManyWords(String str){
        int sumOfWords=0;
        char[] charArray=str.toCharArray();
        for(int i = 0; i<charArray.length;i++) {
            if(str.charAt(i)==' '){
                sumOfWords++;
            }
        }
        return sumOfWords+1;
    }

    public static int altHowManyWord(String str) {
        String[] strArr = str.split(" ");
        return strArr.length;
    }
}
