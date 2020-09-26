//==================================
// Foundations of Computer Science
// Student: Abhishek Das
// id: a1772359
// Semester: 01
// Year: 2019
// Practical Number:05
//===================================
import java.util.Scanner;
public class Main {
	//method to find the next happy number
	public static int nextHappyNumber(int num){
		int test = 0;
		num++;
		while(test == 0){
			int sumOfSquares = num;
			int total=sumOfSquares;
			/*
			 * do while loop to find the 
			 * sum of the square of the digits.
			 * the loop terminates once the sum is 4
			 * as the sum cycle repeats itself.
			*/
			do{
				sumOfSquares = sumOfSquareOfDigits(sumOfSquares);
				if (sumOfSquares == 1) {
					return num;
				}
			}while(sumOfSquares != 4);

			if(total == 1)
				test = 1;
			else
				num++;
		}
		return num;
  }
  	// method to find the sum of the square of the digts recursively
	public static int sumOfSquareOfDigits(int num) {
		if (num == 0)
			return 0;
		else {
			int temp = num % 10;
			return (temp * temp + sumOfSquareOfDigits(num / 10));
		}
	}
	
	
	
	
	
	//method to decode a string
	public String decodeString(String s) {
	
		//check if the string variable has any value
		if(s == null)
			return s;
		if(s.length()==0) 
			return s;
			 
		int indexOfFirstNumber = getIndexOfFirstNumber(s);
		int indexOfFirstBracket = getIndexOfFirstBracket(s);
		int indexOfClosingBracket = getIndexOfClosingBracket(s,indexOfFirstBracket);
			 
		if(indexOfFirstNumber == -1)
			return s;
			 
		String subString1 = s.substring(0,indexOfFirstNumber);
		String subString2 = decodeString(s.substring(indexOfFirstBracket+1,indexOfClosingBracket));
		String subString3 = decodeString(s.substring(indexOfClosingBracket+1,s.length()));
			 
		 //duplicates stores the number of substrings
		int duplicates = Integer.parseInt(s.substring(indexOfFirstNumber,indexOfFirstBracket));
		//System.out.println(duplicates);
			 
		StringBuilder sb = new StringBuilder();
		sb.append(subString1);
			 
		//append all the substrings between the first and last substring
		while(duplicates>0) {
			sb.append(subString2);
				 duplicates--;
		 }
		sb.append(subString3);
			 
		return sb.toString();
			 
			 
		 }
		// method to find index of first number
		public int getIndexOfFirstNumber(String s) {
			int index = -1;
				for(int i=0;i<s.length();i++) {
					char c =s.charAt(i);
					if(c>=47 && c<=58){
						index =i;
						break;
					}
				}
				return index;
				
			}
			
		// method to find index of first bracket
		public int getIndexOfFirstBracket(String s) {
			int index =-1;
			for(int i=0;i<s.length();i++) {
				char c =s.charAt(i);
				if(c=='[') {
					index =i;
					break;
				}
			}
			return index;
		}


		//method to find index of closing bracket
		public int getIndexOfClosingBracket(String s, int indexOfFirstBracket) {
			int index =-1;
			int numberOfBracket =1;
			for(int i=indexOfFirstBracket+1;i<s.length();i++) {
				char c = s.charAt(i);
				if(c=='[')
					numberOfBracket++;
				if(c==']') {
					numberOfBracket--;
					if(numberOfBracket==0) {
						index =i;
						break;
					}
				}
					
			}
			return index;
			
		}
	//driver method	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input: ");
		int n = in.nextInt();
		System.out.println("Output: "+nextHappyNumber(n));
		
		String s ="3[b2[ca]1[d]]";
		Main object =new Main();
		System.out.println(object.decodeString(s));
	}
}