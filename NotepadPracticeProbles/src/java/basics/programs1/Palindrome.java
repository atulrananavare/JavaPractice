package java.basics.programs1;

import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		
		int num=151;
		
		isPalindrome(num);
		
		int number=151;
		int palindrom =IntStream.iterate(number, n -> n != 0, i -> i / 10)
                .map(n -> n % 10)
                .reduce(0, (a, b) -> a * 10 + b);
		
		if(number==palindrom) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
	
	public static void isPalindrome(int num) {
		
		int temp=num;
		int reverse=0;
		int sum=0;
		
		while(num>0) {
			reverse=num%10; //get the reminder
			sum=(sum*10)+reverse;// sume is the reverese number
			num=num/10;	
		}
		
		if(temp==sum) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}

}
