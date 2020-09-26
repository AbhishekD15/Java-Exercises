//==================================
// Foundations of Computer Science
// Student: Abhishek Das
// id: a1772359
// Semester: 01
// Year: 2019
// Practical Number:05
//===================================
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int array1[] = {1,3,5,2,4};
		int answer1[] = {5,4,3,2,1};
		
		int array2[] = {12,31,50,2,49};
		int answer2[] = {50,49,31,12,2};
		
		int array3[] = {65,100,55};
		int answer3[] = {100,65,55};
		
		InsertionSort sortObject1 = new InsertionSort();
		int[] result1 = sortObject1.sort(array1);
		int[] result2 = sortObject1.sort(array2);
		int[] result3 = sortObject1.sort(array3);
		System.out.println("SORTED ARRAY BY INSERTION SORT");
		sortObject1.printArray(result1);
		sortObject1.printArray(result2);
		sortObject1.printArray(result3);
		
		MergeSort sortObject2 =new MergeSort();
		int[] result4 = sortObject1.sort(array1);
		int[] result5 = sortObject1.sort(array2);
		int[] result6 = sortObject1.sort(array3);
		System.out.println("SORTED ARRAY BY MERGE SORT");
		sortObject1.printArray(result4);
		sortObject1.printArray(result5);
		sortObject1.printArray(result6);
		
		QuickSort sortObject3 =new QuickSort();
		int[] result7 = sortObject1.sort(array1);
		int[] result8 = sortObject1.sort(array2);
		int[] result9 = sortObject1.sort(array3);
		System.out.println("SORTED ARRAY BY QUICK SORT");
		sortObject1.printArray(result7);
		sortObject1.printArray(result8);
		sortObject1.printArray(result9);
		
		
		System.out.println(test( result1, answer1 ));
		System.out.println(test( result2, answer2 ));
		System.out.println(test( result3, answer3 ));
	}
	
	public static boolean test(int[] result, int[] answer) {
		// 1. Check for same array reference
		if (result == answer)
			return true;

		// 2. Check if either array is null
		if (result == null || answer == null)
			return false;

		// 3. Check if both arrays have same length or not
		if (result.length != answer.length)
			return false;

		// 4. Finally compare array values at each index
		for (int i = 0; i < result.length; i++)
			if (result[i] != answer[i])
				return false;

		return true;
		
		
		/*if (Arrays.equals(result, answer))
			return true;
		else
			return false;*/
	}

}
