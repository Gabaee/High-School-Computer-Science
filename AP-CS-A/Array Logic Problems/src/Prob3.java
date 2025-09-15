public class Prob3
{
    public static void main(String[] args)
    {
        String[] words = { "dog", "moose", "ox", "bird", "fish" };
        String[] moreWords = { "extreme", "play", "odd", "plays", "class", "fishy", "hi" };
        compare(moreWords);
        compare(words);
    }
    public static void compare(String[] words)
    {
        String longest = words[0];
        String shortest = words[0];
        String ties = "";
        int shortIndex = 0;
        int longIndex = 0;
        String tiesIndex = "";
        for (int i = 1; i < words.length; i++)
        {
            if (words[i].length() > longest.length())
            {
                longest = words[i];
                longIndex = i;
            }
            if (words[i].length() < shortest.length())
            {
                shortest = words[i];
                shortIndex = i;
            }
        }
        int j = 0;
        for (int i = 0; i < words.length; i++)
        {
            if (i == 0) { j++; }
            if (i == (words.length) - 1) { j--; }
            if (words[i].length() == words[j].length())
            {
                ties += (words[i] + ", ");
                tiesIndex += (i + ", ");
            }
            j++;
        }
        System.out.println("Longest: " + longest + ", index: " + longIndex);
        System.out.println("Shortest: " + shortest + ", index: " + shortIndex);
        System.out.println("Ties: " + ties + "indexes: " + tiesIndex);
    }
}