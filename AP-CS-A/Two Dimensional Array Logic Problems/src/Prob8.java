import java.util.Random;
public class Prob8
{
    public static void main(String[] args) {
        int[][] board = {
                {10, 10, 10, 10, 10},
                {10, 50, 50, 50, 10},
                {10, 50, 100, 50, 10},
                {10, 50, 50, 50, 10},
                {10, 10, 10, 10, 10}
        };
        bullseye(board);
    }
    public static void bullseye(int[][] list)
    {
        int totalPoints = 0;
        Random rand = new Random();
        for (int shot = 0; shot < 3; shot++)
        {
            int row = rand.nextInt(list.length);
            int col = rand.nextInt(list[0].length);
            int points = list[row][col];
            totalPoints += points;
            System.out.println("Hit row: " + row + " col: " + col + " Points: " + points);
        }
        System.out.println("Sum: " + totalPoints);
    }
}
