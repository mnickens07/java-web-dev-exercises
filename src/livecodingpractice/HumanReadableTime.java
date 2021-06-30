package livecodingpractice;

import java.util.Scanner;

public class HumanReadableTime {

    public static void main(String[] args) {
        System.out.println("Please enter a number of seconds to be converted to human readable time:");
        Scanner scanner = new Scanner(System.in);
        int secs=scanner.nextInt();
        System.out.println(makeReadableForHumans(secs));

        scanner.close();
    }

    static String makeReadableForHumans(int seconds){

        int hoursAdded = 0;
        int minutesAdded = 0;
        int secondsAdded=0;
        int secondsRemaining;

        if(seconds>359999) {
            return "Max time exceeded";
        }
        if(seconds<60){
            secondsAdded=seconds;
        }else{
            secondsRemaining=seconds/60;
            if(secondsRemaining<60) {
                minutesAdded = secondsRemaining;
                secondsAdded=seconds-(secondsRemaining*60);
            } else {
                secondsAdded = seconds - (secondsRemaining * 60);
                minutesAdded = secondsRemaining % 60;
                secondsRemaining = secondsRemaining = secondsRemaining / 60;
                hoursAdded = secondsRemaining;

            }
        }
        String hourString = String.valueOf(hoursAdded).length() == 2 ? String.valueOf(hoursAdded):"0"+String.valueOf(hoursAdded);
        String minuteString = String.valueOf(minutesAdded).length() == 2 ? String.valueOf(minutesAdded):"0"+String.valueOf(minutesAdded);
        String secondString = String.valueOf(secondsAdded).length() == 2 ? String.valueOf(secondsAdded):"0"+String.valueOf(secondsAdded);
        return hourString + ":" + minuteString + ":" + secondString;
    }
}
