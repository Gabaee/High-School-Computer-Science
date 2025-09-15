public class Prob10
{
    public static void main(String[] args)
    {
        printRepetitiveNumber(3, 6);
    }
    public static void printRepetitiveNumber(int t,int n)
    {
        if(n != 0)
        {
            System.out.print(t + " ");
            printRepetitiveNumber(t, n - 1);
        }
    }
}
