package livecodingpractice;

public class VowelCount {

    public static void main(String[] args) {
        System.out.println(getVowels("codes"));
    }

    static int getVowels(String str){
        int sum=0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='a'||
                    str.charAt(i)=='e'||
                    str.charAt(i)=='i'||
                    str.charAt(i)=='o'||
                    str.charAt(i)=='u'){
                sum++;
            }
        }
        return sum;
    }

}
