package BigO;

import java.util.Arrays;

public class BinerySearchAlgo {

	public static void main(String[] args) {

        int arr[] = {3,4,5,6,7,8,9,10,11};
        Arrays.sort(arr);
        int n=arr.length;
        int x=10;
        
		int result=binerySearch(arr, x, 0,n-1);
		if(result==-1) {
			System.out.println("Element is not found");
		}else {
			System.out.println("Element is found at index :" +result);
		}
		
		
	}
	
	public static int binerySearch(int arr[], int x, int low, int high) {
		
		
		while(low <= high) {
			
			int mid=low + (high - low)/2;
			
			if(arr[mid]==x)
				return mid;
			if(arr[mid] < x) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
			
			
		}
		return -1;
	}
	

}
