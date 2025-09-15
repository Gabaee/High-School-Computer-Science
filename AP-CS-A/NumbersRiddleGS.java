/*
 This is my Numbers Riddle project in Java, by Gabriel Sicurella
 */
public class NumbersRiddleGS
{
    public static void main(String[] args)
    {
        // Special number
        double OriginalNumRiddle = -21.3;
        double NewNumRiddle = OriginalNumRiddle;

        // Prints number before math
        System.out.println("Our starting number is " + OriginalNumRiddle);

        // Mathing
        NewNumRiddle = NewNumRiddle * 2;
        NewNumRiddle = NewNumRiddle + 6;
        NewNumRiddle = NewNumRiddle / 2;
        NewNumRiddle = NewNumRiddle - OriginalNumRiddle;

        // Prints number after math
        System.out.println("Multiplying by 2");
        System.out.println("Adding 6");
        System.out.println("Dividing by 2");
        System.out.println("Subtracting by original number");
        System.out.print("Our ending number is " + NewNumRiddle);
    }
}