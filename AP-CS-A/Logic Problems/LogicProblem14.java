// Problem 14
import java.util.Scanner;
public class LogicProblem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: "); int num = sc.nextInt();
        System.out.print("Prime numbers from 1 to " + num + ": ");
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " "); } }
    }
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false; }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; } }
        return true;
    }
}
