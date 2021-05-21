package programs;

import java.util.HashMap;
import java.util.Map;

public class CamelCaseWordCount {
	/*WAP - Java program
	String a= "ThisIsCamelCase"
	Write a program to find the number of words in this string. 
	Expected output 4*/
	public static void main(String[] args) {
		String a= "ThisIsCamelCase";
				
		char[] arr=a.toCharArray();
		int count=0;
		
		//1. Method 
		for (int i = 0; i < arr.length; i++) {
			if(Character.isUpperCase(arr[i])) {
				count++;
			}			
		}
		System.out.println(count);
		
		//2.Method
		int count1=0;
		String str = "ThisIsCamelCase";
		  for(int i=0; i<a.length(); i++) {
		   if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
			   count1++;
		   }
		  }
		  System.out.println(count1);

		 
		  
	}

}
