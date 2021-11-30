package noteBookPrograms;

public class DuplicateCharacterArray {

	//To print duplicate characters from two arrays
	
	public static void main(String[] args) {
		char[] s1 = {'a','b','C','a','d','z','x'};

		char[] s2 = {'e','b','l','m','d','s','C'};
		int count = 0;
		
		for(int i=0; i<s1.length; i++)
        {
            for(int j=0; j<s2.length; j++)
            {
                if(s1[i] == s2[j])
                {
                    count++;
                    System.out.print(s1[i]);
                }
            }
        }
        System.out.println("\nDuplicate Letters: " + count);

	}

}
