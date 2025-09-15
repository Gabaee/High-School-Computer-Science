import java.util.Scanner;
public class Challenge
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] binaryNum = new int[13];
        System.out.println("Enter a number (0-4095) to convert to a binary text chain: ");
        int num = sc.nextInt();
        while (num < 0 || num > 4095)
        {
            System.out.println("Must be between 0 and 4095.");
            num = sc.nextInt();
        }
        for (int i = 12; i >= 0; i--)
        {
            binaryNum[i] = num & 1;
            num >>= 1;
        }
        for (int j = 0; j < binaryNum.length; j++)
        {
            System.out.print(j + " ");
        }
    }
}