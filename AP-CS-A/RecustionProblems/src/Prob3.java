public class Prob3
{
    public static void main(String[] args)
    {
        countFraction(5, 2);
    }
    public static void countFraction(int n, int count)
    {
        int numerator = 1;
        if(!(count == 6))
        {
            System.out.print(numerator + "/" + count + " ");
            countFraction(n - 1, count + 1);
        }

    }
}
