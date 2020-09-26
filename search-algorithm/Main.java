//==================================
// Foundations of Computer Science
// Student: Abhishek Das
// id: a1772359
// Semester: 01
// Year: 2019
// Practical Number:05
//===================================
public class Main {
	
	//method to check the result
	private static boolean test(int result, int answer) {
		if(result == answer) {
			return true;
		}
		else
			return false;
		
	}
	
	/* 
	 * method to find the maximum value in an 
	 * array of elements which is first 
	 * increasing and then decreasing 
	 */
	private static int findMaxVal(int array[]) {
		int max = array[0]; 
	       int i; 
	       for (i = 0; i < array.length; i++) 
	       { 
	           if (array[i] > max) 
	              max = array[i]; 
	       } 
	       return max; 
		
	}
	
	//driver method
	public static void main(String[] args) {
		int array01[] = {2,3,4,10,40};
		int array02[] = {1,5,8,12,9,7};
		int array03[] = {1,15,0};
		int answer01=3;
		int answer02=5;
		int answer03=0;
		
		LinearSearch object1 =new LinearSearch();
		int result01=object1.search(array01, 10);
		int result02=object1.search(array02, 7);
		int result03=object1.search(array03,1);
		
		System.out.println("Linear Search");
		
		System.out.println("Index of 10: "+result01);
		System.out.println("Index of 7: "+result02);
		System.out.println("Index of 1: "+result03);
		
		System.out.println("Comparision 01:"+Main.test(result01, answer01));
		System.out.println("Comparision 02:"+Main.test(result02, answer02));
		System.out.println("Comparision 03:"+Main.test(result03, answer03));
		
		int answer04=3;
		int answer05=2;
		int answer06=1;
		
		
		BinarySearch object2=new BinarySearch();
		int result04=object2.search(array01, 10);
		int result05=object2.search(array02, 7);
		int result06=object2.search(array03,1);
		
		System.out.println("Binary Search");
		

		System.out.println("Index of 10: "+result04);
		System.out.println("Index of 7: "+result05);
		System.out.println("Index of 1: "+result06);
		
		System.out.println("Comparision 04:"+Main.test(result04, answer04));
		System.out.println("Comparision 05:"+Main.test(result05, answer05));
		System.out.println("Comparision 06:"+Main.test(result06, answer06));
		
		int arr[] = {1, 30, 40, 50, 60, 70, 23, 20};
		System.out.println("Output: "+Main.findMaxVal(arr));
		
		}
	
	

}
