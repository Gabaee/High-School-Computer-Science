import java.util.ArrayList;
import java.util.Scanner;
public class Challenge
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer from 0 - 4095");
        int decimal = sc.nextInt();
        while (decimal < 0 || decimal > 4095)
        {
            System.out.println("Incorrect value");
            decimal = sc.nextInt();
        }
        ArrayList<Integer> binaryNum = decimalToBinary(decimal);

        // BinaryToHex(decimalToBinary(decimal));

    }
    public static ArrayList<Integer> decimalToBinary(int n)
    {
        ArrayList<Integer> binaryNum = new ArrayList<>();
        for (int i = 11; i >= 0; i--)
        {
            int bit = (n >> i) & 1;
            binaryNum.add(bit);
        }
        for (int i = 0; i < binaryNum.size(); i++)
        {
            System.out.print(binaryNum.get(i) + " ");
        }
        return binaryNum;
    }
    public static void BinaryToHex(ArrayList<Integer> binaryNum)
    {
        String converter = "0123456789ABCDEF";
        ArrayList<Integer> list = binaryNum;
        String current4 = "";
        String hexCode = "";
        for (int i = 0; i < binaryNum.size(); i++)
        {
            if (i % 4 != 0)
            {
                current4 = "";
            }
            else
            {
                current4 += String.valueOf(list.get(i));
                current4 = "";
            }
            hexCode += current4;

        }
        System.out.println(hexCode);
    }
}