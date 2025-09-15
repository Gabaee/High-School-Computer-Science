// Problem 5
import java.util.Scanner;
public class LogicProblem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numerator: "); int n1 = sc.nextInt();
        System.out.println("Enter a denominator: "); int d1 = sc.nextInt();
        System.out.println("Enter another numerator: "); int n2 = sc.nextInt();
        System.out.println("Enter another denominator: "); int d2 = sc.nextInt();

        int commonDenominator = d1 * d2;
        int addNumerator = (n1 * d2) + (n2 * d1);
        int subtractNumerator = (n1 * d2) - (n2 * d1);
        int multiplyNumerator = n1 * n2;
        int divideNumerator = n1 * d2;
        String s = " / ";

        System.out.println("Fraction 1: (" + n1 + s + d1 + ")"); System.out.println("Fraction 2: (" + n2 + s + d2 + ")");
        System.out.println("Add: " + addNumerator + s + commonDenominator); System.out.println("Subtract: " + subtractNumerator + s + commonDenominator);
        System.out.println("Multiply: " + multiplyNumerator + s + (d1 * d2)); System.out.println("Divide: " + divideNumerator + s + (d1 * d2));
    }
}
