public class Prob4
{
    public static void main(String[] args)
    {
        int[][] a = {
                {10, 30, 50, 200},
                {60, 40, 70, 55},
                {80, 5, 35, 100}
        };

        avgAndMaxAvg(a);
    }

    public static void avgAndMaxAvg(int[][] list)
    {
        int rows = list.length;
        int cols = list[0].length;

        double maxRowAvg = 0;
        int maxRow = -1;
        double maxColAvg = 0;
        int maxCol = -1;

        for (int ronald = 0; ronald < rows; ronald++)
        {
            double rowSum = 0.0;
            for (int j = 0; j < cols; j++)
            {
                rowSum += list[ronald][j];
            }
            double rowAvg = rowSum / cols;
            System.out.println("Average of row " + ronald + ": "  + rowAvg);

            if (rowAvg > maxRowAvg)
            {
                maxRowAvg = rowAvg;
                maxRow = ronald;
            }
        }
        System.out.println();
        for (int cochran = 0; cochran < cols; cochran++)
        {
            double colSum = 0.0;
            for (int i = 0; i < rows; i++)
            {
                colSum += list[i][cochran];
            }
            double colAvg = colSum / rows;
            System.out.println("Average of col " + cochran + ": " + colAvg);

            if (colAvg > maxColAvg)
            {
                maxColAvg = colAvg;
                maxCol = cochran;
            }
        }
        System.out.println();
        System.out.println("Row with highest avg: " + maxRow + ", avg of row: " + maxRowAvg);
        System.out.println("Column with highest avg: " + maxCol + ", avg of column: " + maxColAvg);
    }
}
