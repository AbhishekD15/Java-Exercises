//==================================
// Foundations of Computer Science
// Student: Abhishek Das
// id: a1772359
// Semester: 01
// Year: 2019
// Practical Number:05
//===================================
public class InsertionSort extends MySortAlg {
	@Override
	int[] sort(int[] array) {
		int n = array.length;
		for (int j = 1; j < n; j++ ) {
			int key = array[j];
			int i = j - 1;
			while(i >= 0 && array[i] < key){
				//shifting one position
				array[i+1] = array[i];
				i = i -1;
			}
			array[i+1] = key;
		}
		return array;
		
		
	}
	//this method prints the array
	 public void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 

}
