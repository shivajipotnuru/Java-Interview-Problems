/*
Given a String, check if that string is a palindrome,
A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam, racecar.
Input:
a string
Output:
if string is a palindrome, output "YES", else output "NO"
Example:
Input:
madam
Output:
YES
*/


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        word = scanner.nextLine();
        int a=0,j=word.length()-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==word.charAt(j))a++;
            j--;
        }
        if(a==word.length()) System.out.println("YES");
        else System.out.println("NO");
    }
}
