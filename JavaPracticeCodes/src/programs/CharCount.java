package programs;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		String str="anbasbvsb";
		
		char[] arr=str.toCharArray();
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for (char c : arr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(str+" : "+map);

	}

}
