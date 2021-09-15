
public class FactorialNumber {

	public static void main(String[] args) {

		//3!=3*2*1
		
		int num=10;
		int fact = 1;
		
		for(int i=1; i<=num; i++) {
			
			fact = fact * i;
		}
		
		System.out.println("factorial of number is: "+fact);
		
	}

}
