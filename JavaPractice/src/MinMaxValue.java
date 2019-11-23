
public class MinMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][] = { { 2, 6, 0 }, { 8, 1, 8 }, { 10, 17, 22 } };
		int min = abc[0][0];
		int mincolume = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min) {
					min = abc[i][j];
					mincolume = j;
				}
			}
		}

		int max = abc[0][mincolume];
		for (int k = 0; k < 3; k++) {
			if (abc[k][mincolume] > max) {
				max = abc[k][mincolume];
			}
		}
		System.out.println(max);
	}

}
