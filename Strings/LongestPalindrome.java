import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String res = longestPalindrome(word);
        System.out.println(res);
    }
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromMiddle(s, i, i); //racecar
            int len2 = expandFromMiddle(s, i,i+1); //abba
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - ((len - 1) / 2);
                end = i + (len / 2) + 1;
            }
        }
        return s.substring(start, end);
    }
    public static int expandFromMiddle(String s, int left, int right) {
        if (s == null || left > right) return 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}
