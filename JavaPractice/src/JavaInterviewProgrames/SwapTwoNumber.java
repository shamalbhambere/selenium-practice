package JavaInterviewProgrames;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int temp=0;
		/*Using Temp variable
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Value of a is after swaping:" +a);
		System.out.println("Value of b is after swaping:" +b);
		*/
		//using operator
		
	    b=b-a;
	    a=a+b;
	    
	    System.out.println("Value of a is after swaping:" +a);
		System.out.println("Value of b is after swaping:" +b);
	
		
		
	}

}
