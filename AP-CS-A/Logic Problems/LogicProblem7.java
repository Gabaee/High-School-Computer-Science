// Problem 7
import java.util.Scanner;
public class LogicProblem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int n1 = sc.nextInt();
        int isLowest = n1;
        int isHighest = n1;
        int n2 = sc.nextInt();
        if (n2 < isLowest) {
            isLowest = n2; }
        if (n2 > isHighest) {
            isHighest =  n2; }
        int n3 = sc.nextInt();
        if (n3 > isHighest) {
            isHighest = n3; }
        if (n3 < isLowest) {
            isLowest = n3; }
        int n4 = sc.nextInt();
        if (n4 > isHighest) {
            isHighest = n4; }
        if (n4 < isLowest) {
            isLowest = n4; }
        int n5 = sc.nextInt();
        if (n5 > isHighest) {
            isHighest = n5; }
        if (n5 < isLowest) {
            isLowest = n5; }
        String s = " ";
        System.out.println("Your numbers are: " + n1 + s + n2 + s + n3 + s + n4 + s + n5);
        System.out.println("Lowest: " + isLowest);
        System.out.println("Highest: " + isHighest);
    }
}
