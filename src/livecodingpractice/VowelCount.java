package livecodingpractice;

public class VowelCount {

    public static void main(String[] args) {
        String testStr="Yas, triiiickk?";
        System.out.println(getCount(testStr));
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
    public static int getCount(String str) {
        int vowelsCount = 0;
        // Your code here
        for(int i = 0; i<str.length(); i++) {
            String vowels="aeiouAEIOU";
            if(vowels.contains(str.charAt(i)+"")){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

}
