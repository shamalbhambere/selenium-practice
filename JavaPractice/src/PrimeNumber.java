
public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void getPrimeNumber(int num) {
		for (int i = 0; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i + "");
			}
		}
	}

	public static void main(String[] args) {
//2 3 5 7 13 17 19
		System.out.println("2 is primenumber:" + isPrimeNumber(2));
		System.out.println("4 is primenumber:" + isPrimeNumber(4));
		System.out.println("7 is primenumber:" + isPrimeNumber(7));
		getPrimeNumber(20);

	}

}
