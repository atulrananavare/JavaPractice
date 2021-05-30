package naveenAutomationLabs;

import java.util.Arrays;

public class ShiftZeroToRight {

	public static void main(String[] args) {
		int[] arr= {0,1,0,2,0,3,0,0,0,1};
		
		shiftToRight(arr);
		
	}
	
	
	public static int[] shiftToRight(int[] arr) {
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
