package noteBookPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class reverseString {

	public static void main(String[] args) {
		String str = "abc";

		char[] arr = str.toCharArray();

		List<Character> list = new ArrayList<Character>();

		for (Character c : arr) {
			list.add(c);
		}

		Collections.reverse(list);

		ListIterator itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}

	}

}
