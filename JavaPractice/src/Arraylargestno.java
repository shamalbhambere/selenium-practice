
public class Arraylargestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 23, 4, 16, 0, 48, 23, 44, 67,3,69,-1,99};
		int val = arr[0];
		for (int i = 0; i <arr.length; i++) {
			if (arr[i]>val) {
				val = arr[i];
			}
		}
		System.out.println(val);

	}

}
