package noteBookPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {
		// Duplicate character in string
		/*
		 * String str="abcabcabca";
		 * 
		 * char[] arr= str.toCharArray();
		 * 
		 * Map<Character,Integer> map=new HashMap<Character,Integer>();
		 * 
		 * for(Character c:arr){ if(map.containsKey(c)){ map.put(c,map.get(c)+1); }
		 * else{ map.put(c,1); } }
		 * 
		 * //To print Set<Character> keys=map.keySet(); for(Character ch:keys){
		 * if(map.get(ch)>1){ System.out.println(ch+"--"+map.get(ch)); } }
		 */

		String str = "abcabcnmnmnmnm";

		char[] arr = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character c : arr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		Set<Character> keys = map.keySet();

		for (Character ch : keys) {
			if (map.get(ch) > 1) {
				System.out.println(ch + "--" + map.get(ch));
			}

		}
	}

}
