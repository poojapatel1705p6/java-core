package com.learning.core.day1session1;

import java.util.Scanner;
public class D01P042 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		int A[] = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
		//int B[] = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0,0 };
		 
		    // Compute the sum of elements from index 0 to 14 and store it at element 15
		    int sum = 0;
		    for (int i = 0; i < 15; i++) {
		      sum += A[i];
		    }
		    A[15] = sum;
		 
		    // Compute the average of all numbers and store it at element 16
		    int average = 0;
		    for (int num : A) {
		     average += num;
		    }
		    //average /= A.length;
		    A[16]= average /A.length;
		    
		    // Identify the smallest value from the array and store it at element 17
		    int smallest = A[0];
		    for (int num : A) {
		    	if (num==0)
		    	continue;
		      if (num <= smallest ||num==0 ){
		        smallest = num;
		       
		      }
		    }{
		    	
		    }

		    A[17] = smallest;
		  
		 
		    // Print the modified array
		    System.out.print("Modified array: ");
		    for (int num : A) {
		      System.out.print(num + " ");
		    }
		 
		    scanner.close();
		  }
		}
