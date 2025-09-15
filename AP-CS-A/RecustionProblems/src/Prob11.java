public class Prob11
{
    public static void main(String[] args)
    {
        printTriangleRecursively(4, 1);
    }
    public static void printTriangleRecursively(int n,int count)
    {
        if (count > n)
        {
            return;
        }
        printStars(count);
        System.out.println();
        printTriangleRecursively(n, count + 1);
    }
    public static void printStars(int count)
    {
        if (count == 0)
        {
            return;
        }
        System.out.print("* ");
        printStars(count - 1);
    }
}