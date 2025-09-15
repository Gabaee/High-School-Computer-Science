import java.util.Arrays;
public class Prob6
{
    public static void main(String[] args)
    {
        int[] a = { 10, 20, 30, 40, 50 };
        int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        swap(a);
        swap(b);
    }
    public static void swap(int[] array)
    {
        System.out.println("Array before swap: " + Arrays.toString(array));
        int temp;
        for (int i = 0; i < array.length / 2; i++)
        {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Array after swap: " + Arrays.toString(array));
    }
}
