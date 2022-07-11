package java.basics.programs1;

public class ReverseStringRecursive {

	public static void main(String[] args) {
		String str="abcd";
		
		String s = reverseString(str);
		System.out.println(s);
	}
	
	public static String reverseString(String str) {
		
		if(str.isEmpty()) {
			return str;
		}
		
		return reverseString(str.substring(1))+str.charAt(0);
	}

}
