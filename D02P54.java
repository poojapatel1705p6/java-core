package com.learning.core.day2session2;
import java.util.Scanner;

public class D02P54 {
 
    public static int palindrome(String str, int start, int end) {
        if (start >= end) {
            return 0;
        }
 
        if (str.charAt(start) == str.charAt(end)) {
            return palindrome(str, start + 1, end - 1);
        }
 
        // Minimum of deletions from either side
        return 1 + Math.min(palindrome(str, start + 1, end), palindrome(str, start, end - 1));
    }
 
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
 
        int minDel = palindrome(str, 0, str.length() - 1);
        System.out.println("Minimum deletions required: " + minDel);
    }
}