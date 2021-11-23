package noteBookPrograms;

public class ReverseString3 {
	public static void main(String[] args) {
		String str = "abc";
		
		byte[] arr=str.getBytes();
		
		byte[] out=new byte[arr.length];
		
		for(int i=0; i<arr.length;i++) {
		out[i]=arr[arr.length-i-1];
		
		}
		System.out.println(new String(out));
	}
}
