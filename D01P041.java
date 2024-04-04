package com.learning.core.day1session1;

import java.util.*;
public class D01P041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int[] numbers = {9,17,39,26,8};
		
		Scanner s = new Scanner(System.in);
		System.out.println("First Number: Enter any number from 1-40:  ");
		int num1 = s.nextInt();
		System.out.println("Second Number: Enter any number from 1-40:  ");
		int num2 = s.nextInt();
		
		boolean foundNum1 = false;
		boolean foundNum2 = false;
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] == num1) {
				foundNum1 = true;
			}
			if (numbers[i] == num2) {
				foundNum2 = true;
			}
		}
		
		if (foundNum1 && foundNum2) {
			System.out.println("Its Bingo");
		}
		else {
			System.out.println("Not Bingo");
		}
	}	
	 
	
}
