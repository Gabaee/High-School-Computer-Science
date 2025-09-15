// Problem 3
import java.util.Scanner;
public class LogicProblem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes you were on the phone: ");
        int min = sc.nextInt();
        double cost;

        if (min <= 3) {
            cost = min * 1.25; }
        else if (min <= 6) {
            cost = 3 * 1.25 + (min - 3) * 1.50; }
        else if (min <= 9) {
            cost = 3 * 1.25 + 3 * 1.50 + (min - 6) * 1.75; }
        else {
            cost = 3 * 1.25 + 3 * 1.50 + 3 * 1.75 + (min - 9) * 2.00; }
        System.out.println("Total cost for " + min + " = $" + cost);
    }
}
