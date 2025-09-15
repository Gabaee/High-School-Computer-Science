public class Prob2
{
    public static void main(String[] args)
    {
        int[] a = {5, 7, 3, 2, 9, 6};
        int[] b = {10, 2, 4, 1, 5, 8, 6, 9, 7, 2};
        int[] c = {100, 100, 100, 99, 351242, 646453757, 865386584, 1351345, 8786458};
        compare(a, 7);
        compare(b, 2);
        compare(c, 100);
    }
    public static void compare(int[] list, int k)
    {
        int lessThanK = 0;
        int greaterThanK = 0;
        int kCount = 0;

        for (int j = 0; j < list.length; j++)
        {
            if (k < j)
            {
                lessThanK++;
            }
            else if (k > j)
            {
                greaterThanK++;
            }
            else
            {
                kCount++;
            }
        }
        System.out.println("K count: " + kCount + " Less than K: " + lessThanK + " Greater than K: " + greaterThanK);
    }
}
