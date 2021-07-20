package livecodingpractice;

import java.util.Date;

public class ChristmasEve {
    public static void main(String[] args) {
        Date dt1 = new Date(12, 6, 2);
        Date dt2 = new Date(122, 6, 3);
        Date testChristmasEve=new Date(122, 11, 24);
//        System.out.println(isChristmasEve(dt1));
//        System.out.println(isChristmasEve(dt2));
        System.out.println(isChristmasEve(testChristmasEve));
    }
    static boolean isChristmasEve(Date date){

        Date today=new Date(121, 6, 2);
        boolean result = date.before(today);
        if(result=true){
            System.out.println("You must enter a date in the future.");
        }
        if(date.getDate()==24 && date.getMonth()==11){
            System.out.println("Set out those milk and Cookies!");
            return true;
        }
        return false;
    }

}
