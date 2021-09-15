
public class FiboncciSeries {

	public static void main(String[] args) {
         
		//0+1+1+2+3+5+8+13
		
		int a=0;
		int b=1;
		int sum=0;
		for(int i=1; i<=15; i++) {
			
			System.out.println(a);
	        sum = a + b;
	        a = b;
	        b = sum; 
		}
	}

}
