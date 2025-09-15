public class Prob2
{
    public static void main(String[] args)
    {
        int[][] a = {
                {10, 30, 50, 200},
                {60, 40, 70, 55},
                {80, 5, 35, 100}
        };
        largestAndSmallest(a);
    }
    public static void largestAndSmallest(int[] [] list)
    {
        int largest = list[0][0];
        int smallest = largest;
        for (int ronald = 0; ronald < list.length; ronald++)
        {
            for (int cochran = 0; cochran < list[ronald].length; cochran++)
            {
                if (list[ronald][cochran] > largest)
                {
                    largest = list[ronald][cochran];
                }
                else if (list[ronald][cochran] < smallest)
                {
                    smallest = list[ronald][cochran];
                }
            }
        }
        System.out.println("Largest: " + largest + " Smallest: " + smallest);
    }
}
