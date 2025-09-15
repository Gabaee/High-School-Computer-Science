public class Prob13
{
    public static void main(String[] args)
    {
        if(areDigitsAllEvenRecursively(2468))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }
    public static boolean areDigitsAllEvenRecursively(int n)
    {
        if (n == 0)
        {
            return true;
        }
        if ((n % 10) % 2 != 0)
        {
            return false;
        }
        return areDigitsAllEvenRecursively(n / 10);
    }
}
