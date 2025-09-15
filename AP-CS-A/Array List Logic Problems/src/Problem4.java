import java.util.ArrayList;
import java.util.List;
public class Problem4
{
    public static void main(String[] args)
    {
        Integer[] a = { 2, 6, -8, 5, -4, -3, 1, -8, 4, -1, 7, 10};
        ArrayList<Integer> aList = new ArrayList<>(List.of(a));
        compare(aList);
    }
    public static void compare(ArrayList<Integer> list)
    {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) > 0)
            {
                negative++;
            }
            else if (list.get(i) < 0)
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
