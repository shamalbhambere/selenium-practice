package JavaInterviewProgrames;

public class LargestAmongThreeNumber {

	public static void main(String[] args) {
		
		int x = 1000;
		int y = 50;
		int z = 500;
		
		if((x > y)&&(x > z)) {
			System.out.println("x is the largest :" +x);
		}else if(y > z) {
			System.out.println("y is the largest :" +y);
		}else {
			System.out.println("z is the largest :" +z);
		}
		
	}

}
