
public class PalindromeNumber {

	public static void main(String[] args) {


		int num=1221;
		int actualValue=num;
		int rev=0;
		
		while(num != 0) {
			int n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;
			
		}
		if(actualValue == rev) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
		
	}

}
