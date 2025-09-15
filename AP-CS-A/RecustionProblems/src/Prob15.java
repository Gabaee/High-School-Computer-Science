public class Prob15
{
    public static void main(String[] args)
    {
        printNumberBackwards(12345);
    }
    public static void printNumberBackwards(int n)
    {
        if(n != 0)
        {
            System.out.print(n % 10);
            printNumberBackwards(n / 10);
        }
    }
}
