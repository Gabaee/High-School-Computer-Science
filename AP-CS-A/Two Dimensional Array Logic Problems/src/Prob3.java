public class Prob3
{
    public static void main(String[] args)
    {
        int[][] a = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        oddEvenCount(a);
    }
    public static void oddEvenCount(int[] [] list)
    {
        int oddCount = 0;
        int evenCount = 0;
        for (int ronald = 0; ronald < list.length; ronald++)
        {
            for (int cochran = 0; cochran < list[ronald].length; cochran++)
            {
                if (list[ronald][cochran] % 2 == 0)
                {
                    evenCount++;
                }
                else
                {
                    oddCount++;
                }
            }
        }
        System.out.println("Odd: " + oddCount + " Even: " + evenCount);
    }
}