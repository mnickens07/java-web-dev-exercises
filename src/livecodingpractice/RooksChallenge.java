package livecodingpractice;

public class RooksChallenge {
    public static boolean canCapture(String[] rooks) {
        for(int i=0; i<rooks.length; i++) {
            if(rooks[0].charAt(0)==rooks[1].charAt(0)){
                return true;
            }
            if(rooks[0].charAt(1)==rooks[1].charAt(1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] testArr={"j3", "j9"};
        System.out.println(canCapture(testArr));

    }
}
