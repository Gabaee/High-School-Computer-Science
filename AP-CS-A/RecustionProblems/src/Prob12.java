public class Prob12
{
    public static void main(String[] args)
    {
        System.out.println(numberOfDigitsRecursively(1234567));
    }
    public static int numberOfDigitsRecursively(long n)
    {
        if (n < 10)
        {
            return 1;
        }
        return 1 + numberOfDigitsRecursively(n / 10);
    }
}
