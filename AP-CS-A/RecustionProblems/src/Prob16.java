public class Prob16
{
    public static void main(String[] args)
    {
        System.out.println(reverseNumRecursively(12345, 5));
    }

    public static int reverseNumRecursively(int n, int nLength)
    {
        if(n == 0)
        {
            return 0;
        }
        int num = (n % 10) * (int) Math.pow(10, nLength - 1);
        return num + reverseNumRecursively(n / 10, nLength - 1);
    }
}