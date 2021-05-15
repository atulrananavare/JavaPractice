package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class sortMapBasedOnUserDesfinedObject_EmpName {

	public static void main(String[] args) {
	
		Map<Integer,Employee> empMap= new HashMap<>();
		empMap.put(120301, new Employee(12301, "pratik", "IT", 3000.0));
		empMap.put(120310, new Employee(12310, "lalit", "HR", 6700.0));
		empMap.put(120305, new Employee(12305, "lokesh", "INFRA", 4500.0));
		empMap.put(120309, new Employee(12309, "abhilash", "Support", 9000.0));
		
		System.out.println("original map is:: ");
		empMap.forEach((k,v)->System.out.println(k+"\t"+v));
		
		// sort based on emp name
		
		Set<Entry<Integer, Employee>> entry = empMap.entrySet();
		List<Entry<Integer, Employee>> list=new ArrayList<Map.Entry<Integer,Employee>>(entry);
		
		Collections.sort(list, new Comparator<Entry<Integer, Employee>>() {

			@Override
			public int compare(Entry<Integer, Employee> o1, Entry<Integer, Employee> o2) {
				
				return o1.getValue().getEmployeeName().compareTo(o2.getValue().getEmployeeName());
			}
		});
		
		System.out.println("after sorting based on emp name is:  ");
		
		list.forEach(s->System.out.println(s.getKey()+"\t"+s.getValue()));
	}

}
