package noteBookPrograms;

public class ReverseString1 {

	public static void main(String[] args) {

		String str = "abc";

		char[] arr = str.toCharArray();

		System.out.println("Before.....");
		System.out.println(arr);
		
		int left=0;
		int right=arr.length-1;
		
		char temp;
		
		for(left=0; left<right; left++,right--) {
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
		}
		System.out.println("After.....");
		System.out.println(arr);
	}

}