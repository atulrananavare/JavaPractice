package programs;

import java.util.Arrays;

public class ArraysClassMethodsUsages {

	public static void main(String[] args) {
		 int[] arr1=new int[] {1,2,3,4};
		 int[] arr2= {6,7,8,9,5};
		 
		 //1. BinarySearch will return index of searched element
		 // array should be in sorted order to get correct result
		System.out.println( Arrays.binarySearch(arr1, 4));
		
		//2.sort array
		Arrays.sort(arr2);
		System.out.println("sorted array is:: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("\t"+arr2[i]);
		}

	}

}
