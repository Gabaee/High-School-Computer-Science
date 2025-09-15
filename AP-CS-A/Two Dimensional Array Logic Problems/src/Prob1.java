public class Prob1
{
    public static void main(String[] args)
    {
        int[][] a = {
                {10, 30, 50, 200},
                {60, 40, 70, 55},
                {80, 5, 35, 100}
        };
        sumAndAverage(a);
    }
    public static void sumAndAverage(int[][] list)
    {
        int sum = 0;
        double avg;
        int count = 0;
        for (int ronald = 0; ronald < list.length; ronald++)
        {
            for (int cochran = 0; cochran < list[ronald].length; cochran++)
            {
                sum += list[ronald][cochran];
                count++;
            }
        }
        avg = (double) sum / count;
        System.out.println("Sum: " + sum + " Average: " + avg);
    }
}
