import java.util.ArrayList;
import java.util.Scanner;
public class Problem8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer from 0 - 255");
        int decimal = sc.nextInt();
        while (decimal < 0 || decimal > 255)
        {
            System.out.println("Incorrect value");
            decimal = sc.nextInt();
        }
        ArrayList<Integer> binaryNum = decimalToBinary(decimal);
        for (int i = 0; i < binaryNum.size(); i++)
        {
            System.out.print(binaryNum.get(i) + " ");
        }
    }
    public static ArrayList<Integer> decimalToBinary(int n)
    {
        ArrayList<Integer> binaryNum = new ArrayList<>();
        for (int i = 7; i >= 0; i--)
        {
            int bit = (n >> i) & 1;
            binaryNum.add(bit);
        }
        return binaryNum;
    }
}
