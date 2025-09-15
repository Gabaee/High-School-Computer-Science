public class Prob5
{
    public static void main(String[] args)
    {
        double[] a = { 2.3, 6.73, 4.01, 3.999, 7.5 };
        double[] b = { 1.24, 9.01, 12.12, 3.998, .025 };
        compare(a);
        compare(b);
    }
    public static void compare(double[] nums)
    {
        double avg = 0;
        double sum = 0;

        for (double num = 0; num < nums.length; num++)
        {
            sum += num;
            avg = sum / nums.length;
        }
        System.out.println("Sum: " + sum + ". Average: " + avg);
    }
}
