package noteBookPrograms;

public class DuplicatesStringArrays {

	public static void main(String[] args) {
		String[] str= {"atul","abhi","atul","abhi","ravi", "ravi","shubh"};
		
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<i;j++) {
				if(str[i]==str[j]) {
					System.out.println(str[j]);
				}
			}
			
		}

	}

}
