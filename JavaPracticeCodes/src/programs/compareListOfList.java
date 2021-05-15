package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class compareListOfList {

	public static void main(String[] args) {
		//[{"pratik"},{"lalit"},{"lokesh"},{"abhilash"}]
		
		// {"pratik","lalit","lokesh","abhilash"} only single list
		List<List<String>> l1= Arrays.asList(Arrays.asList("pratik"),Arrays.asList("lalit"),Arrays.asList("lokesh"),Arrays.asList("abhilash"));
		
		List<String> l2= new ArrayList<String>(Arrays.asList("pratik","lalit","lokesh","abhilash"));
		
		//1. sorting list of list
		List<String> sorted=l1.stream().flatMap(s->s.stream()).sorted((a,b)-> {
			return a.compareTo(b);
		}).collect(Collectors.toList());
		
		System.out.println(sorted.toString());
		
		
		//2. Sorting String single list
		
		List<String> sorted2=l2.stream().sorted((a,b)-> {
			
			return a.compareTo(b);
			
		}).collect(Collectors.toList());
		
		System.out.println(sorted2);
		
		
	
	}

}
