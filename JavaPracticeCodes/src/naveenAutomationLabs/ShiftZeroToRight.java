package naveenAutomationLabs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShiftZeroToRight {

	public static void main(String[] args) {
		int[] arr= {0,1,0,2,0,3,0,0,0,1};
		
		moveZeroes(arr);
		
		List<int[]> list=Arrays.asList(arr);
		
	    Collections.reverse(list);
	    System.out.println(list.toString());
		
	}
	
	
	public static int[] moveZeroes(int[] arr) {
		int[] arrNew=new int[arr.length];
		int count=0;
		
		if(arr.length==1) {
			return arr;
		}
		
		for (int num : arr) {
			if(num!=0) {// non-zero numbers
				arrNew[count]=num;
				count++;
			}
		}
			
		System.out.println(Arrays.toString(arrNew));
		
		return arrNew;
	}

}
