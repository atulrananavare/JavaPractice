package noteBookPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 151;
		int temp=num;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(num);
		System.out.println(rev);
		if (temp == rev) {
			System.out.println("Palindrome Number");

		} else {
			System.out.println("Not a Palindrome Number");
		}

	}

}
