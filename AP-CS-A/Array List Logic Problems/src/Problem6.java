import java.util.ArrayList;
import java.util.List;
public class Problem6
{
    public static void main(String[] args)
    {
        Integer[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ArrayList<Integer> aList = new ArrayList<>(List.of(a));
        swap(aList);
    }
    public static void swap(ArrayList<Integer> list)
    {
        System.out.println("Array before swap: " + list);
        int temp;
        for (int i = 0; i < list.size() / 2; i++)
        {
            temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
        System.out.println("Array after swap: " + list);
    }
}
