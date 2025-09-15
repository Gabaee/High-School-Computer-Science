public class Prob6
{
    public static void main(String[] args) {
        int[][] a = {
                {2, 2, 2},
                {2, 2, 2},
                {2, 2, 2},
        };
        sumDiagonals(a);
    }
    public static void sumDiagonals(int[][] list)
    {
        int rows = list.length;
        int cols = list[0].length;
        int leftToRight = 0;
        int rightToLeft = 0;
        for (int i = 0; i < list.length; i++)
        {
            leftToRight += list[i][i];
            rightToLeft += list[i][list.length - 1 - i];
        }
        int sum = leftToRight + rightToLeft;
        if(!(cols % 2 == 0))
        {
            sum -= list[(rows / 2) + 1][(cols / 2) + 1];
        }

        System.out.println("Sum of both diagonals: " + sum);
    }
}
