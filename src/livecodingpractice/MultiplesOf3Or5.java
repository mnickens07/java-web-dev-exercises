package livecodingpractice;

public class MultiplesOf3Or5 {

    public static void main (String [] args){
            int myNumber=1000;
            System.out.println(solution(4000000));
        }


    public static int solution(int number){
        int total=0;
        if(number<0){
            return 0;
        }
        for(int i = 0; i<number; i++){
            if (i%3==0 || i%5==0){
                total+=i;
            }
        }
        return total;
    }

}
