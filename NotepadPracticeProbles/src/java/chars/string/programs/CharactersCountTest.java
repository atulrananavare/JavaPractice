package java.chars.string.programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactersCountTest {

	public static void main(String[] args) throws ParseException {

		String someString = "JAVA PROGRAMMER";
		char[] strArray = someString.toCharArray();

		// getting distinct characters in strArray
		Set<Character> set = new TreeSet<>();
		for (char c : strArray) {
			set.add(c);
		}
		//set.forEach(System.out::println);

		for (char c : set) {
			// Using Streams & Lambda Expressions in Java 8
			long count = someString.chars().filter(ch -> ch == c).count();
			//System.out.println("Occurances of Character '" + c + "' : " + count);
		}
		
		List<String> list = Arrays.asList(someString.split(" "));
		
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		//map.forEach((key,value)->System.out.println(key+":"+value));
		
		String str1="hello Manish ";
		Map<Object, Long> hm = str1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(hm);
		
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a", Locale.ENGLISH);
	      String dateInString = "24-May-2021 9:45:30 AM";
	      Date date = dateFormatter.parse(dateInString);
	      System.out.println(date);

	}

}

