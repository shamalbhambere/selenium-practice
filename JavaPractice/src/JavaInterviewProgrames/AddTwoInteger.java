package JavaInterviewProgrames;

import java.util.Scanner;

public class AddTwoInteger {

	public static void main(String[] args) {
	
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter 2 number :");
		int a = reader.nextInt();
		int b = reader.nextInt();
		
		int c = a + b;
		System.out.println("Addition of 2 number is :" +c);
		
		
	}

}
