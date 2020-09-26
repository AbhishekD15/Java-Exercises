import java.util.Scanner;

public class CheckPrime {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);  
		//try block
		try {
	    System.out.print("Please, insert a number ");  
	    int n = input.nextInt();  
		
		
	       if (isPrime(n)) {  //calling isPrime() method for verification
	           System.out.println(n + " is a prime number");  
	       } else {  
	           System.out.println(n + " is not a prime number");  

	       }
		}
		   //catch block
	       catch(Exception e) {
				System.out.println("Please check for "+e);
			}
	       input.close();
}
	   //defining isPrime() method
	   public static boolean isPrime(int n) { 
		   int m=n/2;
	       if (n <= 1) 
	           return false;  
	       
	       
	    	   for (int i = 2; i <=m; i++)  { 
	    	   		if (n % i == 0) 
	    	   			return false;
	    	   }
	    	   		return true;
	    	   	
	    	   
	  
	 
		
}
}

	    	   			
	   

