package exercises;

//import java.util.Arrays;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String firstSen="Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?";
        System.out.println("Enter a word to search for: ");
        String wordSearch = input.nextLine().toLowerCase();
        if (firstSen.toLowerCase().contains(wordSearch)){

            int index = firstSen.indexOf(wordSearch);
            String replaceString = firstSen.replace(wordSearch,"");
            System.out.println("'"+ wordSearch + "'"+" was found.");
            System.out.println(index +" "+ wordSearch.length());
            System.out.println(replaceString);



        }else{
            System.out.println("'"+ wordSearch + "'"+ " was not found.");
        }
    }
}
