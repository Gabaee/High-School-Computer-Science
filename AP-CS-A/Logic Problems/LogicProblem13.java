// Problem 13
import java.util.Scanner;
public class LogicProblem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        int factor = 0;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                factor = i;
                break; } }
        if (isPrime) {
            System.out.println("Yes, it's prime!");
        } else {
            System.out.println("No, the number is composite... Factor = " + factor);
        }
    }
}
