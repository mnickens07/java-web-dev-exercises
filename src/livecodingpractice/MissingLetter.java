package livecodingpractice;

public class MissingLetter {

    public static void main(String[] args) {

        char[] myTestArray={'m','a','r','c'};
        System.out.println(findMissingLetter(myTestArray));
    }

    static char findMissingLetter(char[] charArray){
        char currentLetter=charArray[0];
        for(char character:charArray){
            if(character!=currentLetter){
                break;
            }
            currentLetter++;
        }
        return currentLetter;
    }

}
