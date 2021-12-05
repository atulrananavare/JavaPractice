package noteBookPrograms;

public class StringManuplations {

	

	public static void main(String[] args) {
		String str = "The_Rains _have started here";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf("hellow"));
		
		System.out.println(str.indexOf("s", str.indexOf('s')+1));
		
		System.out.println(str.substring(0, 8));
		
		System.out.println(str.trim());
		
		String[] arr=str.split("_");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	
		
	}

}
