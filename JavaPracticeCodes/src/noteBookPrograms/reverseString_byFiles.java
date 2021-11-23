package noteBookPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//Pending
public class reverseString_byFiles {

	public static void main(String[] args) throws IOException {

			/*File sourceFile = new File("C:\\Users\\atul_rananavare\\git\\JavaPractice\\JavaPracticeCodes\\Test1.txt");
			BufferedReader br
            = new BufferedReader(new FileReader(sourceFile));

			String str;
	        // Consition holds true till
	        // there is character in a string
	        while ((str = br.readLine()) != null)
	            // Print the string
	            System.out.println(str);
	        
	        char[] arr = str.toCharArray();
	        int left=0;
			int right=arr.length-1;
			
			char temp;
			
			for(left=0; left<right; left++,right--) {
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
			System.out.println("After.....");
			System.out.println(arr);*/
		 try {
			 
			 File sourceFile = new File("C:\\Users\\atul_rananavare\\git\\JavaPractice\\JavaPracticeCodes\\Test1.txt");
				
		      BufferedReader input = new BufferedReader(new FileReader(sourceFile));
		      ArrayList list = new ArrayList();
		      String line;
		      while ((line = input.readLine()) != null) {
		        list.add(line);
		      }
		      input.close();

		      Collections.reverse(list);

		      PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(args[1])));
		      for (Iterator i = list.iterator(); i.hasNext();) {
		        output.println((String) i.next());
		      }
		      output.close();
		    } catch (IOException e) {
		      System.err.println(e);
		    }
		
	}
	
		

}
