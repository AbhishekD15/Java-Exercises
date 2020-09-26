
public class LinearSearch {
	
	public int search(int[] array,int num ) {
		int n =array.length;
		for(int i=0;i<n;i++) {
			if(array[i]==num)
				return i;
		}
		return -1;
		
	}

}
