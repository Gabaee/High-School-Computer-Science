/*
This is my Choose Your Own Path text based game. The user follows a story that has multiple branches and multiple possible endings.
Made by: Gabriel Sicurella
 */
// Extra things: Viewable flowchart - Lines 79-84
// Extra things: String variables for the same ending - Lines 19 and 20
import java.util.Scanner;
public class ChooseYourPathGS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean choice1, choice2, choice3;
        System.out.println("Welcome to the Interactive Story!");
        System.out.println("You find yourself in a mysterious forest. Which path will you choose?");
        System.out.println("1. Take the left path");
        System.out.println("2. Take the right path");
        int userChoice = sc.nextInt();

        // Endings
        String goodEnd = "Congratulations, you've found the treasure! (Good ending).";
        String badEnd = "You did not survive. Game over... (Bad ending)";

        // Embedded statements
        if (userChoice == 1) { // talk to animal
            choice1 = true;
            System.out.println("You encounter a talking animal.");
            System.out.println("1. Listen to the animal's advice");
            System.out.println("2. Ignore the animal and continue walking");
            userChoice = sc.nextInt();

            if (userChoice == 1) { // danger
                choice2 = true;
                System.out.println("The animal warns you about a hidden danger ahead.");
                System.out.println("1. Proceed with caution");
                System.out.println("2. Turn back and explore another path");
                userChoice = sc.nextInt();

                if (userChoice == 1) { // Good ending 1
                    choice3 = true;
                    System.out.println("You cautiously proceed and find a hidden treasure!");
                    System.out.println(goodEnd); }
                else { // dead
                    choice3 = false;
                    System.out.println("You decide to turn back and explore other paths.");
                    System.out.println("After some time, you find a friendly village.");
                    System.out.println("You are safe now, however, you did not receive the life saving treasure... " + badEnd); } }
            else { // dead
                choice2 = false;
                System.out.println("You ignore the animal and continue walking.");
                System.out.println("Unfortunately, you fall into a trap and get captured by forest bandits.");
                System.out.println(badEnd); } }
        else { // River
            choice1 = false;
            System.out.println("You take the right path and reach a river.");
            System.out.println("1. Build a raft and cross the river");
            System.out.println("2. Swim across the river");
            userChoice = sc.nextInt();

            if (userChoice == 1) { // Portal
                choice2 = true;
                System.out.println("You successfully build a raft and cross the river.");
                System.out.println("On the other side, you find a magical portal.");
                System.out.println("1. Enter the portal");
                System.out.println("2. Ignore the portal and explore further");
                userChoice = sc.nextInt();

                if (userChoice == 1) { // Good ending 2
                    choice3 = true;
                    System.out.println("You enter the portal and find yourself in a different world.");
                    System.out.println("You step through the portal and... " + goodEnd); }
                else { // dead
                    choice3 = false;
                    System.out.println("You decide to explore further and discover a hidden cave.");
                    System.out.println("Inside the cave, you find a sleeping dragon.");
                    System.out.println("Unfortunately, you wake up the dragon, and it's not happy.");
                    System.out.println(badEnd); } }
            else { // dead
                choice2 = false;
                System.out.println("You decide to swim across the river.");
                System.out.println("You struggle against the strong currents and get swept away.");
                System.out.println(badEnd); } }
        System.out.println("Would you like to see the full story and it's endings? (1 = yes, 2 = no)");
        int yOrn = sc.nextInt();
        if (yOrn == 1) {
            System.out.println("Follow this link (https://photos.app.goo.gl/rWCMhv25HNZbTnM38. Paste into browser) to view the flowchart..."); }
       else {
            System.out.println("Okay! Ending game..."); }
    }
}
