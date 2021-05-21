package programs;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWordCount {

	public static void main(String[] args) {
		 String input = "eeessmmmskaaakkbd";
	        Map<Character, Integer> map = new HashMap<>();

	        for (int i = 0; i < input.length(); i++) {
	            if (map.containsKey(input.charAt(i))) {
	                int temp = map.get(input.charAt(i)) + 1;
	                
	                map.put(input.charAt(i), temp);
	                
	            } else {
	                map.put(input.charAt(i), 1);
	            }
	        }
	        /*for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	            System.out.print(entry.getValue() + "" + entry.getKey());
	        }*/
		  
	        map.keySet().stream().filter(k->map.get(k)<3).forEach(e->System.out.print(e));
	        	
	     String str=   removeDuplicateCharacters(input);
	     System.out.println("\t"+str);
	}
	
	
	public static String removeDuplicateCharacters(String value) {
	    while (true) {
	        char firstChar = value.charAt(0);
	        int count = 0;
	        for (int i = 0; i < value.length(); i++) {
	            if (value.charAt(i) == firstChar) {
	                count++;
	                if (count == 3) {
	                    value = value.replaceAll(String.valueOf(firstChar), "");
	                    count = 0;
	                }
	            }
	        }
	        if (count == 1 || count == 2) {
	            break;
	        }
	    }
	    return value;
	}

}
