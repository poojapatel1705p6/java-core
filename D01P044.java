package com.learning.core.day1session1;
import java.util.ArrayList;
import java.util.List;
 
public class D01P044 {
 
    public static void findCombinations(int[] arr, int k, int start, List<Integer> current, List<List<Integer>> combinations) {
        if (current.size() == k) {
            combinations.add(new ArrayList<>(current));
            return;
        }
 
        for (int i = start; i < arr.length; i++) {
            current.add(arr[i]);
            findCombinations(arr, k, i + 1, current, combinations);
            current.remove(current.size() - 1); // Backtrack
        }
    }
 
    public static void main(String[] args) {
    	 int k = 2;
        int[] arr = {1, 2, 3};
       
        List<List<Integer>> combinations = new ArrayList<>();
        findCombinations(arr, k, 0, new ArrayList<>(), combinations);
 
        System.out.println("Combinations:");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
          
