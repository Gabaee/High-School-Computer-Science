public class Prob9
{
    public static void main(String[] args)
    {
        printParenthesesRecursively(5);
    }
    public static void printParenthesesRecursively(int n)
    {
        if(n != 0)
        {
            String leftP = ("(");
            String rightP = (")");
            System.out.print(leftP + " ");
            printParenthesesRecursively(n - 1);
            System.out.print(rightP + " ");
        }
    }
}
