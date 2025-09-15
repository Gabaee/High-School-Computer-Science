public class Prob18
{
    public static void main(String[] args)
    {
        long n1 = 1234321;
        System.out.println("Is " + n1 + " palindromic?");
        if(isPalindrome(n1))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    public static boolean isPalindrome(long n)
    {
        String num = String.valueOf(n);
        return isPalindromeChecker(num, 0, num.length() - 1);
    }
    private static boolean isPalindromeChecker(String num, int start, int end)
    {
        if (start >= end)
        {
            return true;
        }
        if (num.charAt(start) != num.charAt(end))
        {
            return false;
        }
        return isPalindromeChecker(num, start + 1, end - 1);
    }
}
