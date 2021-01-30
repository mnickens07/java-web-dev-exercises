package studios.chapter3studio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
//     Class Variables
//     Class Constructor
    public CharacterCounter(){
}
//    Methods
    public static void countCharacters(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text or name: ");
        String userString = input.nextLine();

        input.close();

        char[] charactersInString = userString.toLowerCase().toCharArray();

        HashMap<Character, Integer> myCharMap =  new HashMap<>();
        for (Character userChars: charactersInString){
            if (myCharMap.containsKey(userChars)){
                int value = myCharMap.get(userChars) +1;
                myCharMap.put(userChars, value);
//                System.out.println(myCharMap.put(c, value));
            } else {
                myCharMap.put(userChars, 1);
            }

        }
        for (Map.Entry<Character, Integer> charCount : myCharMap.entrySet()) {
            System.out.println(charCount.getKey() + ": " + charCount.getValue() );
        }
    }
}
