public class Prob1
{
    public static void main(String[] args)
    {
        int[] a = {-5, -7, -3, -2, -9, -6};
        int[] b = {10, 2, 4, 1, 5, 8, 6, 9, 7};
        int[] c = {100, 99, 351242, 646453757, 865386584, 1351345, 8786458};
        compare(a);
        compare(b);
        compare(c);
    }
    public static void compare(int[] list)
    {
        int high = list[0];
        int low = list[0];
        for (int j : list)
        {
            if (j > high)
            {
                high = j;
            }
            else if (j < low)
            {
                low = j;
            }
        }
        System.out.println("Largest: " + high + " Smallest: " + low);
    }
}
