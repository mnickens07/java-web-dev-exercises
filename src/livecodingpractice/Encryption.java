package livecodingpractice;

public class Encryption {
    public static String encrypt(String word) {
        for (int i = 0; i < word.length(); i++) {
            word = word.toLowerCase().replace('a', '0').replace('e', '1').replace('i', '2').replace('o', '2').replace('u', '3');
        }
        return new StringBuilder(word).reverse()+"aca";
    }

    public static void main(String[] args) {
        String testString="geeksForGeeks";
        System.out.println(encrypt(testString));

    }
}
