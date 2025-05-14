package FlowControl;

import java.util.Scanner;

public class BasicTextCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");

        String input = scanner.nextLine(); // reading the whole sentence // input is of type string

        //Check for a word, if that word is present in the sentence
        Scanner checkForWord = new Scanner(System.in);
        System.out.println("Enter the word to be checked");
        String checkWord = checkForWord.next();
//        String checkWord = "hello";
        if(input.toLowerCase().contains(checkWord)){ // two String methods , toLowerCase(), contains()
            System.out.println( checkWord + " is present in the sentence.");
        }else{
            System.out.println(checkWord + " is not present in the sentence.");
        }
    }
}
