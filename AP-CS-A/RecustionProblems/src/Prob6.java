public class Prob6
{
    public static void main(String[] args)
    {
        print10s(6, 1);

    }
    public static void print10s(int n, int count)
    {
        if(n > 0)
        {
            System.out.print(count + " ");
            print10s(n - 1, count * 10);

        }
    }
}
