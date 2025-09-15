// Problem 9
import java.util.Scanner;
public class LogicProblem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        int k = 3;
        int count = numDig(num, k);
        System.out.println("The number " + k + " appears " + count + " times");
    }
    public static int numDig(int num, int k) {
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit == k) {
                count++; }
            num /= 10; }
        return count;
    }
}

