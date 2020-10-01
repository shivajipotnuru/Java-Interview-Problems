import java.util.Arrays;

/**
 * This class will check if two Strings are Anagram to each other
 * Anagram Definition: a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.
 */
public class AnagramCheck {

    public static boolean checkAnagram(String word1, String word2) {
        // Lets us compare both words by elimination process

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();
        // Check #1 = compare lengths of both words. If lengths are different, not an anagram.

        int length1 = word1Array.length;
        int length2 = word2Array.length;

        if (length1 != length2) {
            return false;
        }

        // Check #2 = Sort letters in both words and compare each of them in order
        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        for (int i = 0; i < word1Array.length; i++) {
            if (word1Array[i] != word2Array[i]) {
                return false;
            }
        }

        // If both #1 and #2 didn't fail, both words are Anagrams.
        return true;
    }

    public static void main(String[] args) {
        String word1 = "iceman";
        String word2 = "cinema";

        boolean result = checkAnagram(word1, word2);
        String verdict = result ? "Anagrams" : "Not Anagrams";

        System.out.println(word1 + " " + word2 + " are " + verdict);
    }
}