public class Prob2
{
    public static void main(String[] args)
    {
        countUp(1, 7);
    }

    public static void countUp(int n, int stopNum)
    {
        if (!(n == stopNum + 1))
        {
            System.out.print(n + " ");
            countUp(n + 1, 7);
        }
    }
}