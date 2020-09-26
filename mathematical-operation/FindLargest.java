import java.util.Scanner;
public class FindLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		//try block
		try { 
		 System.out.print("Please, insert the first number ");  
		    int n = input.nextInt();  
		  System.out.print("Please, insert the second number ");  
		    int m = input.nextInt(); 
		   //finding the bigger number
		   if(m>n) {
			   System.out.println("The bigger number is "+ m);
		   }
		   else {
		   System.out.println("The bigger number is "+n);
		   }
		   input.close();
	}
	
	//catch block
	catch(Exception e) {
		System.out.println("Not an integer value.Please check for "+e);
	}
	}
}