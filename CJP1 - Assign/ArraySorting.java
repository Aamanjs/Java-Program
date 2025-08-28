package cdac;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
	
	public static void sortArray(int[] arr) {
		
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
		    for (int j = i+1; j < arr.length; j++) {
		        if (arr[i] > arr[j]) {
		        	swap(arr,i,j);
		            System.out.println(Arrays.toString(arr));
		        }
		    }
		}
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		
		int n = sc.nextInt();
		int[] arr = new int[n];

		
		System.out.println("Enter "+n+" elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
    
		sortArray(arr);
		
		System.out.println("Sorted array in ascending order:");
		for (int num:arr) {
			System.out.println(num + " ");
		}
		
		sc.close();
	}
	
	
}
