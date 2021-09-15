package JavaInterviewProgrames;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Plz Enter year :");
		int year = reader.nextInt();

		boolean leap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = true;
					} else {
                    leap = false;
				}
			}else {
				leap = true;
			}
		}else {
			leap = false;
		}
		if(leap) {
			System.out.println(year+" is leap year");
		}else {
			System.out.println(year+" is not leap year");
		}
	}

}
