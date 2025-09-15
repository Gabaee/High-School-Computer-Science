// Problem 2
import java.util.Scanner;
public class LogicProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your weight: ");
        double weight = sc.nextDouble(); sc.nextLine();
        System.out.println("Enter what planet you would like to convert your weight to (Mercury - Pluto): ");
        String planet = sc.nextLine();
        if (planet.equalsIgnoreCase("mercury")) {
            weight *= 0.38;}
        else if (planet.equalsIgnoreCase("venus")) {
            weight *= 0.78;}
        else if (planet.equalsIgnoreCase("mars")) {
            weight *= 0.39;}
        else if (planet.equalsIgnoreCase("jupiter")) {
            weight *= 2.65;}
        else if (planet.equalsIgnoreCase("saturn")) {
            weight *= 1.17;}
        else if (planet.equalsIgnoreCase("uranus")) {
            weight *= 1.05;}
        else if (planet.equalsIgnoreCase("neptune")) {
            weight *= 1.23;}
        else if (planet.equalsIgnoreCase("pluto")) {
            weight *= 0.05;}
        else {
            System.out.println("Invalid planet, please try again...");
            return; }
        System.out.println("Your weight on " + planet.toLowerCase() + " is: " + weight + " lbs.");
    }
}