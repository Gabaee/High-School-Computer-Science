public class Prob9
{
    public static void main(String[] args)
    {
        int[][] a = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        transposeMatrix(a);
    }
    public static void transposeMatrix(int[][] list)
    {
        for (int ron = 0; ron < list.length; ron++)
        {
            for (int cochran = ron + 1; cochran < list.length; cochran++)
            {
                int temp = list[ron][cochran];
                list[ron][cochran] = list[cochran][ron];
                list[cochran][ron] = temp;
            }
        }
        for (int ron = 0; ron < list.length; ron++)
        {
            for (int cochran = 0; cochran < list[0].length; cochran++)
            {
                System.out.print(list[ron][cochran] + " ");
                if(cochran == list[0].length - 1)
                {
                    System.out.println();
                }
            }

        }
    }
}
