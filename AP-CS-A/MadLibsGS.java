/* This is my Mad Lib project, it uses the java scanner utility to gather user inputs relevant to the blanks in the mad lib and assigns them to variables.
It then prints the mad lib with all the user given variables appended. By: Gabriel Sicurella. */
import java.util.Scanner; // Imports the java scanner utility
public class MadLibsGS {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in); // Starts input scanner
        System.out.println("Welcome to today's Mad Lib!!");

        // Asks whether you would like to see the mad lib before, or go in blind
        System.out.println("Would you like to preview today's mad lib first, or would you like to go in blind?: y/n"); String yOrn = sc.nextLine();
        if (yOrn.equalsIgnoreCase("y")) {
            System.out.println("""
                    Title: The Misadventures of [Name1] and [Name2]
                    
                    Once upon a time, in a [Adjective3] [Place4], there lived two best friends, [Name1] and [Name2]. They were known far and wide for their [GoodAdjective5] personalities and their insatiable curiosity.
                    One sunny [Adjective6] morning, [Name1] and [Name2] decided to embark on a(n) [TypeOfAdventure7] adventure. They packed their bags with [Noun8], a trusty [Noun9], and a map of [Place10]. Their first destination was a mysterious [Noun11] hidden deep in the [ScaryName12] forest.
                    As they journeyed through the forest, they encountered a [Adjective13] [Animal14] that demanded they solve a riddle to pass. With their quick wits, [Name1] and [Name2] guessed the answer, and the [Adjective13] [Animal14] let them continue on their way.
                    Finally, they reached the hidden [Noun11] and discovered a treasure chest filled with (a) [Creepy Insect]. Their adventure had been a success, and they couldn't wait to tell everyone about it when they returned to their [Adjective3] [Place4]!
                    The end...""");}
        System.out.println("All right, here we go!");
        System.out.println("--------------------------------");

        // Asks and inputs for the blank spaces in the mad lib
        System.out.println("Please enter your name: "); String name1 = sc.nextLine();
        System.out.println("Please enter a friend's name: "); String name2 = sc.nextLine();
        System.out.println("Please enter an adjective: "); String adj3 = sc.nextLine();
        System.out.println("Please enter a place: "); String place4 = sc.nextLine();
        System.out.println("Please enter a positive personality trait: "); String adj5 = sc.nextLine();
        System.out.println("Please enter a time of day (Ex: morning, evening, afternoon): "); String timeOfDay6 = sc.nextLine();
        System.out.println("Please enter a type of adventure: "); String tpOfAdv7 = sc.nextLine();
        System.out.println("Please enter a survival item: "); String noun8 = sc.nextLine();
        System.out.println("Please enter another survival item: "); String noun9 = sc.nextLine();
        System.out.println("Please enter a place: "); String place10 = sc.nextLine();
        System.out.println("Please enter a thing: "); String thing11 = sc.nextLine();
        System.out.println("Please enter a scary name: "); String scName12 = sc.nextLine();
        System.out.println("Please enter another adjective: "); String adj13 = sc.nextLine();
        System.out.println("Please enter an animal: "); String aml14 = sc.nextLine();
        System.out.println("Please enter an insect that grosses you out: "); String cpyInsect15 = sc.nextLine();
        System.out.println("------------------------------------------------------");

        // Mad lib with variables
         String doneMadLib = "Title: The Misadventures of " + name1 + " and " + name2 + "\n\nOnce upon a time, in a " + adj3 + " " + place4 + " there lived two best friends, " + name1 + " and " + name2 + ".\n" +
                "They were known far and wide for their " + adj5 + " personalities and their insatiable curiosity.\nOne " + timeOfDay6 + ", " + name1 +  " and " + name2 + " decided to embark on a(n) " + tpOfAdv7 + " adventure.\n" +
                "They packed their bags with (a)" + noun8 + ", a trusty " + noun9 + ", and a map of " + place10 + ". Their first destination was a mysterious " + thing11 + " hidden deep in the " + scName12 + " forest.\n" +
                "As they journeyed through the forest, they encountered a " + adj13 + " " + aml14 + " that demanded they solve a riddle to pass. With their quick wits, " + name1 + " and " + name2 + " guessed the answer,\nand the " + adj13 + aml14 + " let them continue on their way.\n" +
                "Finally, they reached the hidden " + thing11 + " and discovered a treasure chest filled with (a) " + cpyInsect15 + ".\nTheir adventure had been a success, and they couldn't wait to tell everyone about it when they returned to their " + adj3 + " " + place4 + "!\nThe end...";
        System.out.println(doneMadLib); // Prints finished mad lib
    }
}