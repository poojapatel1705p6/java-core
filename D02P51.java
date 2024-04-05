package com.learning.core.day2session2;
import java.util.Scanner;
public class D02P51 {
	
	    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	 
	        int length = inputString.length();
	        //wtoSystem.out.println("The length of the string is: " + length);
	 
	        boolean isPalindrome = isPalindrome(inputString);
	 
	        if (isPalindrome) {
	            System.out.println(inputString + " is a Palindrome");
	        } else {
	            System.out.println(inputString + " is not a Palindrome");
	        }
	    }
	 
	    public static boolean isPalindrome(String str) {
	        int len = str.length();
	        for (int i = 0; i < len / 2; i++) {
	            if (str.charAt(i) != str.charAt(len - 1 - i)) {
	                return false;
	            }
	        }
	        return true;
	    }
	}