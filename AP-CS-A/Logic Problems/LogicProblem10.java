// Problem 10
import java.util.Scanner;
public class LogicProblem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        int evenDigit = evenDigits(num);
        System.out.println("Number of even digits in given integer: " + evenDigit);
    }
    public static int evenDigits(int num) {
        int evenDigit = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenDigit++; }
            num /= 10; }
        return evenDigit;
    }
}
