package com.learning.core.day2session2;
import java.util.Scanner;


public class D02P52 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		       System.out.print("Enter a string: ");
		       String text = scanner.nextLine();
		 
		       System.out.print("Enter the number of vowels to count: ");
		       int n = scanner.nextInt();
		 
		       String lastNVowels = countLastNVowels(text, n);
		       System.out.println(lastNVowels);
		   }
		 
		   public static String countLastNVowels(String text, int n) {
		       String vowels = "aeiouAEIOU";
		       int vowelCount = 0;
		       String lastVowels = "";
		 
		       for (int i = text.length() - 1; i >= 0; i--) {
		           if (vowels.indexOf(text.charAt(i)) != -1) {
		               vowelCount++;
		               lastVowels = text.charAt(i) + lastVowels;
		               if (vowelCount == n) {
		                   return lastVowels;
		               }
		           }
		       }
		 
		       return "Mismatch in Vowel Count";
		   }
		}