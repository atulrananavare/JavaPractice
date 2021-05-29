package OOP;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Student s1= new Student("Tome", 1, 90, 15);
		Student s2= new Student("Pete", 2, 80, 16);
		Student s3= new Student("Lisa", 3, 95, 17);
		Student s4= new Student("Robby", 4, 100, 15);
		Student s5= new Student("Naveen", 5, 50, 14);
		
		//add students objects to the arrayList
		
		List<Student> studentList= new ArrayList<Student>();
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		System.out.println("Total Students: "+ studentList.size());
		
		//iterate over a list (need toString method to override)
		for (Student student : studentList) {
			System.out.println(student.toString());
		}
		
		//2nd way to iterate using java 8
		//studentList.stream().forEach(e-> System.out.println(e));
		
		//marks of student >80		
		studentList.stream().filter(e->e.getMarks()>80).forEach(e->System.out.println(e.getName()+":"+e.getMarks()));
		
		//name who got the highest marks
		int hm=studentList.stream().map(e->e.getMarks()).max(Integer :: compare).get();
		
		studentList.stream().filter(e->e.getMarks()==hm).forEach(e->System.out.println(e));
	}

}
