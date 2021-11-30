package noteBookPrograms;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String s="#*$+-Atul$12~()0%#@";

		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
	}

}
