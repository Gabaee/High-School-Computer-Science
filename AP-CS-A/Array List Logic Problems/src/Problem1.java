import java.util.ArrayList;
import java.util.List;
public class Problem1
{
    public static void main(String[] args)
    {
        Integer[] a = {10, 2, 4, 1, 5, 8, 6, 9, 7, 1};
        ArrayList<Integer> aList = new ArrayList<>(List.of(a));
        compare(aList);
    }
    public static void compare(ArrayList<Integer> list)
    {
        int high = list.getFirst();
        int low = list.getFirst();
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) > high)
            {
                high = list.get(i);
            }
            else if (list.get(i) < low)
            {
                low = list.get(i);
            }
        }
        System.out.println("largest: " + high + " Smallest: " + low);
    }
}