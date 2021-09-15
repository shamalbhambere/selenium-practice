
public class ArmstrongNumber {

	public static void main(String[] args) {


		int num=153;
		int actualValue=num;
		double result=0;
		
		while(num != 0) {
			int n= num % 10;
			result= result + Math.pow(n, 3);
			num = num / 10;
			
		}
		
		if(actualValue == result){
			System.out.println("The number is armstrong");
		}else {
			System.out.println("The number is not armstrong");
		}
		
	}

}
