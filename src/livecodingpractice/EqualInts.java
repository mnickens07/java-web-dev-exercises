package livecodingpractice;

public class EqualInts {
    public static void main(String[] args) {
        int a=3;
        int b=3;
        int c=3;
        System.out.println(equal(a,b,c));
    }

    public static int equal(int a, int b, int c) {
        if(a==b&&a==c) {
            return 3;
        } else if(a==b||a==c||b==c) {
            return 2;
        }
        return 0;
    }
}
