
public class FactorsOfNumber {

	public static void main(String[] args) {


		//10=1 2 5 10
		
		int num=10;
		
		for(int i=1; i<=num; i++) {
			if(num % i==0) {
				System.out.println(i + " ");
			}
		}
	}

}
