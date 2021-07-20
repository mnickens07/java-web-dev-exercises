package livecodingpractice;

public class ArrayOfMultiples {
    public static int[] arrOfMultiples(int num, int length) {
        int[] arrMults=new int[length];
        for(int i=0; i<length; i++) {
            arrMults[i]=num*(i+1);
        }

        return arrMults;
    }

    public static String bomb(String str) {
//        String testStr=str.toLowerCase();
        if(str.toLowerCase().contains("bomb")){
            return "DUCK!";
        }else
        return "Relax, there's no bomb.";
    }



    public static void main(String[] args) {
        System.out.println(bomb("Hey You, BomB."));
    }
}
