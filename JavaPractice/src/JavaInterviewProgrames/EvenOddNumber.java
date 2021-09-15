package JavaInterviewProgrames;

public class EvenOddNumber {

	public static void main(String[] args) {
	
		evenOdd(20);
		evenOdd(27);
		

	}

	public static void evenOdd(int num) {
		
		if(num % 2 == 0) {
			System.out.println("Given number is even");
		}else {
			System.out.println("Given number is odd");
		}
	}
}
