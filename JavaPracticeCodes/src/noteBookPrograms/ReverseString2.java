package noteBookPrograms;

public class ReverseString2 {

	public static void main(String[] args) {
		String str="abc";
		
		System.out.println(reverse(str));
		
		//StringBuffer 
		StringBuffer sb= new StringBuffer(str);
		System.out.println(sb.reverse());

	}

	public static String reverse(String str) {

		if (str.isEmpty()) {
			return str;
		} 
		
		else {
			return reverse(str.substring(1)) + str.charAt(0);
		}

	}

}
