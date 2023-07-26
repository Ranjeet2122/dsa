package dsa;

import java.util.Arrays;

public class Main {

	 public static void main(String[] args) {
	        int [] arr  = {13,32,26,35,10};
	        
//	        for(int val : arr) {
//	            System.out.print(val + " ");
//	        }
	        System.out.println(Arrays.toString(arr));
	        
	       // Bubble.bubbleSort(arr);
	       // Selection.SelectionSort(arr);
	        Insertion.InsertionSort(arr);
//	        for(int val : arr) {
//	            System.out.print(val + " ");
//	        }
	        System.out.println(Arrays.toString(arr));
	      
	    }
	}