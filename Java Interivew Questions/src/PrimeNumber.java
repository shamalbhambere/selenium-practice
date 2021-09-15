
public class PrimeNumber {

	public static void main(String[] args) {

             
		int num = 1;
		boolean flag =true;
		
		if(num <=1) {
			flag=false;
		}
		for(int i=2; i<=num/2; i++) {
			
			if(num % i==0) {
				flag = false;
				break;
			}
		}
		if(!flag) {
			System.out.println("Number is prime");
		}else
			System.out.println("Number is not prime");
		
	}

}
