public class Prob1
{
    public static void main(String[] args)
    {
        countDown(5);
    }
    public static void countDown(int n)
    {
        {
            if(!(n == 0))
            {
                System.out.print(n + " ");
                countDown(n - 1);
            }
        }
    }
}
