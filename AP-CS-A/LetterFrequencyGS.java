/*
This is my Letter Frequency program, it takes a user inputted string, and counts each letter in the given string.
The program will store and print the letters found, and the number of occurrences
By: Gabriel Sicurella
 */
//Above and beyond things: User input for phrase, prints number of letters with an int variable
import java.util.Scanner;
public class LetterFrequencyGS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = sc.nextLine();
        String lowercasePhrase = phrase.toLowerCase();

        int phraseLength = phrase.length();
        System.out.println("-------------------");
        System.out.println("Given phrase: " + phrase + "\nNumbers of letters in phrase: " + phraseLength);

        // Iterates through the alphabet
        for (char letter = 'a'; letter <= 'z'; letter++) {
            int count = 0;
            // Iterates through the letters of the phrase
            for (int i = 0; i < lowercasePhrase.length(); i++) {
                char current = lowercasePhrase.charAt(i);
                // Checks if the current character matches the current letter of the alphabet
                if (current == letter) { count++; } }
            if (count > 0) {
                System.out.println(letter + ", Frequency: " + count); } }
    }
}
