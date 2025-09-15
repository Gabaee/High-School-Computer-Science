public class Prob17
{
    public static void main(String[] args)
    {
        System.out.println(powerRecursively(2, 5));
    }

    public static int powerRecursively(int a, int b)
    {
        if (b == 0)
        {
            return 1;
        }
        else if (b < 0)
        {
            return 1 / powerRecursively(a, -b);
        }
        else
        {
            return a * powerRecursively(a, b - 1);
        }
    }
}
