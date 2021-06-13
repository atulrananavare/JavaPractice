package programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeSort {

	public static void main(String[] args) {


		List<Integer> l1= new ArrayList<Integer>();
		List<Integer> l2= new ArrayList<Integer>();
		
		l1.add(1);
		l1.add(2);
		l1.add(4);
		
		l2.add(1);
		l2.add(3);
		l2.add(4);
		
		//System.out.println(l1);
		//System.out.println(l2);
		
		l1.addAll(l2);
		
		//System.out.println(l1);
		
		l1.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);
			}
		});
		
		System.out.println(l1);
		

	}

}
