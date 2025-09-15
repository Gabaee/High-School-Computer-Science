import java.util.ArrayList;
import java.util.List;
public class Problem3
{
    public static void main(String[] args)
    {
        String[] words = { "dog", "moose", "ox", "bird", "fish" };
        ArrayList<String> wordsList = new ArrayList<>(List.of(words));
        compare(wordsList);
    }
    public static void compare(ArrayList<String> wordsList)
    {
        String longest = wordsList.getFirst();
        String shortest = wordsList.getFirst();
        String ties = "";
        int shortIndex = 0;
        int longIndex = 0;
        String tiesIndex = "";
        for (int i = 1; i < wordsList.size(); i++)
        {
            if (wordsList.get(i).length() > longest.length())
            {
                longest = wordsList.get(i);
                longIndex = i;
            }
            if (wordsList.get(i).length() < shortest.length())
            {
                shortest = wordsList.get(i);
                shortIndex = i;
            }
        }
        int j = 0;
        for (int i = 0; i < wordsList.size(); i++)
        {
            if (i == 0) { j++; }
            if (i == (wordsList.size()) - 1) { j--; }
            if (wordsList.get(i).length() == wordsList.get(j).length())
            {
                ties += (wordsList.get(i) + ", ");
                tiesIndex += (i + ", ");
            }
            j++;
        }
        System.out.println("Longest: " + longest + ", index: " + longIndex);
        System.out.println("Shortest: " + shortest + ", index: " + shortIndex);
        System.out.println("Ties: " + ties + "indexes: " + tiesIndex);
    }
}
