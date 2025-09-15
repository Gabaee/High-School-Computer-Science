public class Prob4
{
    public static void main(String[] args)
    {
        int[] a = { 2, 6, -8, 5, -4, -3, 1, -8, 4, -1, 7, 10};
        int[] b = { 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -2, -3, -4, -5, -6, -7, -8, 10 };
        compare(a);
        compare(b);
    }
    public static void compare(int[] num)
    {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i : num)
        {
            if (i < 0)
            {
                negative++;
            }
            else if (i > 0)
            {
                positive++;
            }
            else
            {
                zero++;
            }
        }
        System.out.println("positive count: " + positive + ". Negative count: " + negative + ". Zero count: " + zero);
    }
}
