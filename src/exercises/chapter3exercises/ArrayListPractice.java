package exercises.chapter3exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args){
        ArrayList<Integer> numToAdd = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Integer theSum = ArrayListPractice.addEvenNum(numToAdd);
        System.out.println(theSum.toString());
        ArrayPractice arrayPractice = new ArrayPractice();
        String[] returnedWords = arrayPractice.splitString();
        ArrayList<String> fiveLetterWords = new ArrayList<>(Arrays.asList(returnedWords));
        System.out.println("Enter the length of your word: ");
        Integer searchLength = ArrayListPractice.getUserInput();
        ArrayListPractice.printFiveLetterWords(fiveLetterWords, searchLength);

    }

    public static Integer getUserInput(){
        Scanner input = new Scanner(System.in);
        Integer userInt = input.nextInt();
        input.close();
        return userInt;
    }

    public static void printFiveLetterWords(ArrayList<String> words, Integer searchLength){
        for (int i=0;i<words.size();i++) {
            if (words.get(i).length() == searchLength) {
                System.out.println(words.get(i));
            }
        }
    }

//    since the instructions ask us to "find the sum" instead of "print out" this function will not be void. It will return the even values added up.
    public static Integer addEvenNum(ArrayList<Integer> evenValuesToAdd){
        int total = 0;
        for (int i=0;i<evenValuesToAdd.size();i++){
            if (evenValuesToAdd.get(i)%2==0){
            total += evenValuesToAdd.get(i);

            }
        }
        return total;
    }

}
