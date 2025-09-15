public class Prob5
{
    public static void main(String[] args)
    {
        countUpEven(5, 1);
    }
    public static void countUpEven(int n, int count)
    {
        if(n > 0)
        {
            if (count % 2 == 0)
            {
                count ++;
            }
            System.out.print(count + " ");
            countUpEven(n - 1, count + 2);
        }
    }
}
