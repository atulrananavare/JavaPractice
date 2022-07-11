package java.basics.programs1;

import java.util.stream.IntStream;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str="MADAM";
		isPalindrome(str);
		
		Boolean b=isPalindromeInJava8(str);
		System.out.println(b);
		
		
	}
	
	public static void isPalindrome(String str) {
		
		String reverse="";
		int length=str.length();
		
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		
		if(str.equals(reverse)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
	}
	
	private static boolean isPalindromeInJava8(String input) {

		return IntStream.range(0, input.length() / 2)
				.noneMatch(index -> input.charAt(index) != input.charAt(input.length() - index - 1));

	}
	
	


}
