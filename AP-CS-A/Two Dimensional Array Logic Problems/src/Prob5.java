public class Prob5
{
    public static void main(String[] args)
    {
        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
    sumOfEdges(a);
    }

    public static void sumOfEdges(int[][] list)
    {
        int rows = list.length;
        int cols = list[0].length;
        int sum = 0;

        for (int cochran = 0; cochran < cols; cochran++)
        {
            sum += list[0][cochran];
            sum += list[rows - 1][cochran];
        }

        for (int ron = 1; ron < rows - 1; ron++)
        {
            sum += list[ron][0];
            sum += list[ron][cols - 1];
        }
        System.out.println("Sum of edges: " + sum);
    }
}