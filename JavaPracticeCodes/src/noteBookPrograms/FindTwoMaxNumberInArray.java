package noteBookPrograms;

public class FindTwoMaxNumberInArray {

	public static void main(String[] args) {
		
		int values[]= {1,3,4,10,9,6};
		int arr[]=twoLargest(values);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] twoLargest(int values[]){
	    int largestA = Integer.MIN_VALUE, largestB = Integer.MIN_VALUE;

	    for(int value : values) {
	        if(value > largestA) {
	            largestB = largestA;
	            largestA = value;
	        } else if (value > largestB) {
	            largestB = value;
	        }
	    }
	    return new int[] { largestA, largestB }; 
	}

}
