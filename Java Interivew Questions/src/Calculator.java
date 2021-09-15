import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {


		Scanner reader= new Scanner(System.in);
		
		System.out.println("Please enter 2 number:");
		
		double first=reader.nextDouble();
		double second=reader.nextDouble();
		
		System.out.println("Chose one operator(+, -, *, /) from given option: ");
		char operator = reader.next().charAt(0);
		
		double result=0;
		
		switch(operator) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
			break;
			
			
			default:
				System.out.println("Please choose operator");
				break;
		}
		System.out.println(result);
	}

}
