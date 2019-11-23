
public class Arraymax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{3,5,7},{12,4,6},{6,9,22}};
		int max=a[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]>max)
				{	
				max=a[i][j];
				}
			}
		}
          System.out.println(max);
	}

}
