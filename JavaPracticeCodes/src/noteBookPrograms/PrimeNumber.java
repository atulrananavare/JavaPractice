package noteBookPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		printPrime(100);
		

	}
	
	
	public static void printPrime(int num) {
		
		for(int i=2;i<=num;i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i+" ");
			}
		}
	}


	private static boolean isPrimeNumber(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
