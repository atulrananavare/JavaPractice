package java.basics.programs1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	
		String str="abcde";
		char[] arr = str.toCharArray();
		char temp;
		int first=0;
		int last=arr.length-1;
		
		for(first=0;first<last;first++,last--) {
			temp=arr[first];
			arr[first]=arr[last];
			arr[last]=temp;
		}
		
		System.out.println(arr);
		
	}

}
