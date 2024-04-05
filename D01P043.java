package com.learning.core.day1session1;

public class D01P043 {

	public static int RepeatingElement(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					return i;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
		int n = arr.length;
		int index = RepeatingElement(arr, n);
		if (index == -1) {
			System.out.println("No repeating element found!");
		}
		else {
			System.out.println("First repeating element is " + arr[index]);
		}
	}
}
