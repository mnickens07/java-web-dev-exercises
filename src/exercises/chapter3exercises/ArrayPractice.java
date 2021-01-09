package exercises.chapter3exercises;

import java.util.Arrays;

public class ArrayPractice {


        ArrayPractice myArrays= new ArrayPractice();
//        myArrays.printOdd();
//        myArrays.splitString();
//        myArrays.splitInSentences();


    public void printOdd(){
        int[] myArr = {1, 1, 2, 3, 5, 8};

        for (int i=0;i< myArr.length;i++){
            if (myArr[i]%2!=0) {
                System.out.println(myArr[i]);
            }
        }
    }

    public String[] splitString(){
        String greenEggsStr = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse. ";
        String[] greenEggsArr = greenEggsStr.split(" ");
//        System.out.println(Arrays.toString(greenEggsArr));
        return greenEggsArr;
    }

    public void splitInSentences(){
        String greenEggsStr = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse. ";
        String[] greenEggsArr = greenEggsStr.split("\\.");
        System.out.println(Arrays.toString(greenEggsArr));    }
}
