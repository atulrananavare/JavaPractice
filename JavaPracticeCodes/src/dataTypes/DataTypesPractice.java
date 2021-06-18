package dataTypes;

public class DataTypesPractice {

	public static void main(String[] args) {
		//Auto-Boxing: primitive DT to Wrapper conversion
		int i=10;
		Integer I=i;
		
		//Auto-unboxing: Wrapper to primitive DT conversion
		Integer a=new Integer(10);
		int b=a.intValue();// unBoxing
		int c=a;
		System.out.println(b);
		System.out.println(c);
		
		
		//DT conversion long to float exponential output 3.20009E7
		
		long q=32000899;
		float l=(float) q;
		System.out.println(l);
		
		

	}

}
