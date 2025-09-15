import java.util.List;
import java.util.ArrayList;
public class Problem5
{
    public static void main(String[] args)
    {
        Double[] a = { 2.3, 6.73, 4.01, 3.999, 7.5 };
        ArrayList<Double> aList = new ArrayList<>(List.of(a));
        compare(aList);
    }
    public static void compare(ArrayList<Double> list)
    {
        double avg = 0;
        double sum = 0;

        for (double num = 0; num < list.size(); num++)
        {
            sum += num;
            avg = sum / list.size();
        }
        System.out.println("Sum: " + sum + ". Average: " + avg);
    }
}
