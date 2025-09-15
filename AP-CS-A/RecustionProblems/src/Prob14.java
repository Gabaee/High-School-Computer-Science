public class Prob14
{
    public static void main(String[] args)
    {
        System.out.println(countNumberOfKsRecursively(323345321, 3, 0));

    }
    public static int countNumberOfKsRecursively(long n, int k, int count)
    {
        if (n != 0)
        {
            if ((n % 10) == k)
            {

                count++;
            }
            return countNumberOfKsRecursively(n / 10, 3, count);
        }
        return count;
    }
}
