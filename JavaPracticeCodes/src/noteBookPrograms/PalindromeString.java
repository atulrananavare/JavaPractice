package noteBookPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "ABCDCBA";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println(str+" is a palindrome number");
		}
		else {
			System.out.println(str+" is not a palindrome number");
		}

	}

}
