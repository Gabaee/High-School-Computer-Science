// Problem 12
import java.util.Scanner;
public class LogicProblem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer 2-8 numbers long: "); int num = sc.nextInt();
        int palindrome = reverseNumber(num);
        if (num == palindrome) {
            System.out.println(num + " is a palindrome"); }
        else {
            System.out.println(num + " is not a palindrome"); }
    }
    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10; }
        return reversedNum; }
}
