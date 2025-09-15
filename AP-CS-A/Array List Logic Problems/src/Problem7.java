import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class Problem7
{
    public static void main(String[] args)
    {
        Integer[] a = { 5, 7, 3, 1, 4, 6, 2, 15 };
        ArrayList<Integer> aList = new ArrayList<>(List.of(a));
        getHighest(aList);
    }
    public static void getHighest(ArrayList<Integer> list)
{
    int largest1 = 0;
    int largest2 = 0;
    int largest3 = 0;

    for (int i = 0; i < list.size(); i++)
    {
        if (i > largest1)
        {
            largest3 = largest2;
            largest2 = largest1;
            largest1 = i;
        }
        else if (i > largest2)
        {
            largest3 = largest2;
            largest2 = i;
        }
        else if (i > largest3)
        {
            largest3 = i;
        }
    }
    System.out.println("Largest: " + largest1 + ". Second largest: " + largest2 + ". Third largest: " + largest3);
    if (largest1 > (largest2 + largest3))
    {
        System.out.println("YES, " + largest1 + " is greater than " + largest2 + " + " + largest3);
    }
    else
    {
        System.out.println("NO, " + largest1 + " is not greater than " + largest2 + " + " + largest3);
    }
}
}
