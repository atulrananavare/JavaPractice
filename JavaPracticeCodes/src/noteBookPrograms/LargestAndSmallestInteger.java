package noteBookPrograms;

import java.util.Arrays;

public class LargestAndSmallestInteger {

	public static void main(String[] args) {

		int[] num= {-10,24,-88,50,12345};
		int largest=num[0];
		int smallest=num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>largest) {
				largest=num[i];
			}
			else if(num[i]<smallest) {
				smallest=num[i];
			}
		}
		System.out.println(Arrays.toString(num));
		System.out.println(smallest);
		System.out.println(largest);
		
		
	}

}
