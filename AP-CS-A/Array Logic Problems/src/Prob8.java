// I researched bitwise operators for java
// https://www.geeksforgeeks.org/bitwise-operators-in-java/
// And help from stepdad

import java.util.Scanner;
public class Prob8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] binaryNum = new int[8];
        System.out.println("Enter a number (0-255) to convert to a binary text chain: ");
        int num = sc.nextInt();
        while (num < 0 || num > 255)
        {
            System.out.println("Invalid input... must be between 0 and 255.");
            num = sc.nextInt();
        }
        for (int i = 7; i >= 0; i--)
        {
            binaryNum[i] = num & 1; // if both bits are 1, it returns 1, else it returns 0
            num >>= 1; // Right shift
        }
        for (int j = 0; j < binaryNum.length; j++)
        {
            System.out.print(j + " ");
        }
    }
}
