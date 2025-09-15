import java.util.ArrayList;
import java.util.List;
public class Problem2
{
    public static void main(String[] args)
    {
        Integer[] a = {5, 7, 3, 2, 9, 6};
        ArrayList<Integer> aList = new ArrayList<>(List.of(a));
        compare(aList, 7);
    }
    public static void compare(ArrayList<Integer> list, int k)
    {
        int lessThanK = 0;
        int greaterThanK = 0;
        int kCount = 0;
        for (int i = 0; i < list.size(); i++)
        {
            if (k < i)
            {
                lessThanK++;
            }
            else if (k > i)
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
