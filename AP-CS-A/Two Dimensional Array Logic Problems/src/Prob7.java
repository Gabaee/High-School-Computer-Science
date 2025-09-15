public class Prob7 {
    public static void main(String[] args) {
        String[][] words = {
                {"dog", "kitty", "moose", "ant", "elephant", "mooseee"},
                {"frog", "bird", "bat", "porcupine", "mice", "aeiuo"},
                {"lion", "zebra", "snake", "toad", "turtle", "eioua"}
        };
        wordWithMostVowels(words);
    }
    public static int countVowels(String word)
    {
        int vowelCount = 0;
        for (int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);
            if (isVowel(c)) {
                vowelCount++;
            }
        }
        return vowelCount;
    }
    public static boolean isVowel(char c)
    {
        String vowels = "aeiou";
        return vowels.indexOf(c) != -1;
    }
    public static void wordWithMostVowels(String[][] list)
    {
        int maxVowelCount = 0;
        String maxVowels = "";
        int row = -1;
        int col = -1;

        for (int ron = 0; ron < list.length; ron++)
        {
            for (int cochran = 0; cochran < list[ron].length; cochran++)
            {
                if (countVowels(list[ron][cochran]) >= maxVowelCount)
                {
                    maxVowelCount = countVowels(list[ron][cochran]);
                    maxVowels = list[ron][cochran];
                    row = ron;
                    col = cochran;
                }
            }
        }
        for (int ron = 0; ron < list.length; ron++)
        {
            for (int cochran = 0; cochran < list[ron].length; cochran++)
            {
                if (countVowels(list[ron][cochran]) == maxVowelCount)
                {
                    maxVowelCount = countVowels(list[ron][cochran]);
                    maxVowels = list[ron][cochran];
                    row = ron;
                    col = cochran;
                }
            }
            System.out.print("Word with the most vowels: " + maxVowels + " - Row: " + row + ", Column: " + col);
            System.out.println(" Vowel count: " + maxVowelCount);
        }
    }
}
