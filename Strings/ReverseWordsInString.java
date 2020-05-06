/*
Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.

Input:
contains a string S containing characters.

Output:
output a single line containing the reversed String.

Constraints:
1 <= T <= 100
1 <= |S| <= 2000

Example:
Input:

i.like.this.program.very.much


Output:
much.very.program.this.like.i


@author- https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0

*/
import java.util.Scanner;
public class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);       
        String str=sc.nextLine();
        System.out.print(wordReverse(str));
    } 
    static String wordReverse(String str) 
    { 
    int i = str.length() - 1; 
    int start, end = i + 1; 
    String result = ""; 
      
    while(i >= 0) 
    { 
        if(str.charAt(i) == '.') 
        { 
            start = i + 1; 
            while(start != end) 
                result += str.charAt(start++); 
            result += '.'; 
            end = i; 
        } 
        i--; 
    } 
      
    start = 0; 
    while(start != end) 
        result += str.charAt(start++); 
      
    return result; 
} 
  
}