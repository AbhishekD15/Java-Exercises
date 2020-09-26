import java.util.Random; // importing Random class

public class PrintStar {

	public static void main(String[] args) {
		
		
		// create random object 
        Random ran = new Random(); 
        for(int i = 0;i <10; i++)
        {
  
        // generating integer 
        int num = ran.nextInt(20); 
  
        
        System.out.print("Number (" +num+ ") :" );
        for(int j=0;j<=num;j++) {
        	System.out.print("*");
        }
    		System.out.println();
        }
	}

	}

