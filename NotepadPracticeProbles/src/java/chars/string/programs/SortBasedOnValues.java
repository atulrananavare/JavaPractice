package java.chars.string.programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortBasedOnValues {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("abc", 2);
		map.put("ert", 3);
		map.put("ertyu", 12);
		map.put("rtyh", 0);
		map.put("cv", 5);
		
		ArrayList<Map.Entry<String, Integer>> l1= new ArrayList<>(map.entrySet());

		LinkedList<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				return o1.getKey().compareTo(o2.getKey());
			}

		});

		for (Entry<String, Integer> entry : list) {

			//System.out.println( entry.getKey());

		}
		
		List<Entry<String, Integer>> sort = l1.stream().sorted(new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o2.getValue()-o1.getValue();
			}
		}).collect(Collectors.toList());
	
		
		for(Entry<String, Integer> entry:sort) {
			System.out.println(entry.getValue());
		}

	}

}
