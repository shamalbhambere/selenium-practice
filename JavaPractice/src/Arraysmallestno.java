
public class Arraysmallestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {23,78,2,90,55,3,1,99,-1};
		
		int val=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<val)
			{
				val=a[i];
				
			}
		}
		System.out.println(val);
	}

}
