package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class compareStringObjectFromMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "pratik");
		map.put(3, "lalit");
		map.put(9, "lokesh");
		map.put(2, "abhilash");
				
		//entry set first to set entries into set collection
		Set<Entry<Integer,String>> entrySet= map.entrySet();
		
		// 
		List<Entry<Integer,String>> list= new ArrayList<Map.Entry<Integer,String>>(entrySet);
		System.out.println("befor sorting");
		list.forEach(s->System.out.println(s.getKey()+"\t"+s.getValue()) );
		
		
		Collections.sort(list, new Comparator<Entry<Integer,String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		System.out.println(" After sorting ");
		
		list.forEach(s->System.out.println(s.getKey()+"\t"+s.getValue()));
	}

}
