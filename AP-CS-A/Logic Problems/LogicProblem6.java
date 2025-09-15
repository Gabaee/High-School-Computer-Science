// Problem 6
import java.util.Scanner;
public class LogicProblem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an x coordinate: "); int x1 = sc.nextInt();
        System.out.println("Enter a y coordinate: "); int y1 = sc.nextInt();
        System.out.println("Enter a second x coordinate: "); int x2 = sc.nextInt();
        System.out.println("Enter a second y coordinate: "); int y2 = sc.nextInt();

        int x = (x2-x1);
        int y = (y2-y1);
        String s = " / ";
        if (x == 0) {
            System.out.println("Undefined slope. Please try again");
        return; }
        if (x < 0) {
            x *= -1;
            y *= -1; }
        System.out.println("The slope of " + x1 + s + y1 + " and " + x2 + s + y2 + " is:");
        System.out.println(y+ " / " + x);
    }
}

