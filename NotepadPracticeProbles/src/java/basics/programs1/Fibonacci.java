package java.basics.programs1;

public class Fibonacci {

	public static void main(String[] args) {
/*	long a=0;
	long b=1;
	
	for (int i = 0; i < 10; i++) {
		long c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		
	}*/
	
	
	for(int i=0;i<=10;i++) {
		int num = fib(i);
		System.out.println(num);
	}
	}
	
	public static int fib(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return (fib(n-1)+fib(n-2));
		}
		
	}

}
