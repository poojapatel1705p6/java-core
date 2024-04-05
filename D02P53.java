package com.learning.core.day2session2;
import java.util.*;

public class D02P53 {
	
	public static void Subsequences(String input, String output, int index) {
        if (index == input.length()) {
            if (output.length() >= 0) {
                System.out.print(output+" ");
            }
            return;
        }
 
        // Include current character in subsequence
        Subsequences(input, output + input.charAt(index), index + 1);
 
        // Exclude current character from subsequence
        Subsequences(input, output, index + 1);
    }
 
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
 
        String output = "";
        int index = 0;
 
        System.out.println("Subsequences of \"" + input + "\":");
        Subsequences(input, output, index);
    }
}