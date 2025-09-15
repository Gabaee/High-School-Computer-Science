// Problem 4
import java.util.Scanner;
public class LogicProblem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side length a: "); int a = sc.nextInt();
        System.out.println("Enter side length b: "); int b = sc.nextInt();
        System.out.println("Enter side length c: "); int c = sc.nextInt();
        if (a > 0 && b > 0 || c > 0) {
            if (a + b > c && a + c > b) {
                if (a == c && b == c) {
                    System.out.println("The triangle is equilateral.");
                }
                if (a != b && b != c && a != c) {
                    System.out.println("The triangle is scalene.");
                } else {
                    System.out.println("The triangle is isosceles.");
                }
            } else {
                System.out.println("This is not a possible triangle, make sure the sum of 2 sides is greater than the third.");
            }
        }
        else {
            System.out.println("Ensure that there are no negative side lengths");
        }
    }
}
