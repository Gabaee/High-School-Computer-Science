// Problem 1
import java.util.Scanner;
public class LogicProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a temperature in Fahrenheit");
        double f = sc.nextDouble();
        System.out.println("Enter a temperature in Celsius");
        double c = sc.nextDouble();
        double fToC;
        double cToF;
         cToF = c * 1.8 + 32; fToC = (f - 32) * ((double) 5 / 9);
        System.out.println(f + " degrees Fahrenheit converted to Celsius is: " + Math.round(fToC) + "°");
        System.out.println(c+ " degrees Celsius converted to Fahrenheit is: " + Math.round(cToF) + "°");
    }
}