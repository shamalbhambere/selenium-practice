
public class PaliandromeNumber {

	public static void isPaliandromeNumber(int num) {
		int rev = 0;
		int sum = 0;
		int t;

		t = num;
		while (num > 0) {
			rev = num % 10;
			sum = (sum * 10) + rev;
			num = num / 10;
		}

		if (t == sum) {
			System.out.println("Number is Paliandrome");
		} else {
			System.out.println("Number is not Paliandrome");
		}
	}

	public static void main(String[] args) {
		isPaliandromeNumber(121);
		isPaliandromeNumber(134);
		isPaliandromeNumber(78487);
		isPaliandromeNumber(-121);

		int a;
		int b;
		a = 1;// 2
		b = a++;// 1
		System.out.println(a);
		System.out.println(b);
		
		a = 2;// 3
		b = ++a;//3
		
		System.out.println(a);
        System.out.println(b);
	
        a = 2;//1
        b = a--;//2
        
        System.out.println(a);
        System.out.println(b);
	
        a = 2;//1
        b = --a;//1
        
        System.out.println(a);
        System.out.println(b);
	
 
	}

}
