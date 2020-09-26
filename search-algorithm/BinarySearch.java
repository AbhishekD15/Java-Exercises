import java.util.Arrays;

public class BinarySearch {
	public int search(int[] array,int num) {
		int n= array.length;
		Arrays.sort(array);
		int result=binarySearch(array,0,n-1,num);
		return result;
		
	}
	
	

	public int binarySearch(int[] array, int left, int right, int num) {
		if(left >right) {
			return -1;
		}
		int mid =left +((right-left)/2);
		if(array[mid]==num) {
			return mid;
		}
		else if(num <array[mid]) {
			return binarySearch(array,left,mid-1,num);
		}
		else if(num >array[mid]) {
			return binarySearch(array,mid+1,right,num);
			
		}
		else return -1;
	}

}
