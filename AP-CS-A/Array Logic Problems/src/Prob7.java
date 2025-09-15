public class Prob7
{
    public static void main(String[] args)
    {
        int[] a = { 5, 7, 3, 1, 4, 6, 2, 15 };
        int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        getHighest(a);
        getHighest(b);
    }
    public static void getHighest(int[] list)
    {
        int largest1 = 0;
        int largest2 = 0;
        int largest3 = 0;

        for (int i = 0; i < list.length; i++)
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

