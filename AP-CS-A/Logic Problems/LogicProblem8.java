// Problem 8
import java.util.Scanner;
public class LogicProblem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 grade percentages that are integers: ");
        int g1 = sc.nextInt(), g2 = sc.nextInt(), g3 = sc.nextInt(), g4 = sc.nextInt(), g5 = sc.nextInt();

        int min = g1;
        if (g2 < min) {
            min = g2; }
        if (g3 < min) {
            min = g3; }
        if (g4 < min) {
            min = g4; }
        if (g5 < min) {
            min = g5; }
        int sum = g1 + g2 + g3 + g4 + g5 - min;
        double avg = (double) sum / 4;
        System.out.println("Average of the 4 highest grades: " + avg + ". The dropped grade was: " + min);
    }
}
