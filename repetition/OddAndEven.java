import java.util.Random;// importing Random class

public class OddAndEven {
	

	public static void main(String[] args) {
		int sum = 0;
		float average= 0.0f;
		
		// create random object 
        Random ran = new Random(); 
        for(int i = 0;i <10; i++)
        {
  
        // generating integer 
        int num = ran.nextInt(20); 
  
        
        System.out.print("Number (" +num+ ") :" );
        sum = sum+num;
        average= (float) (sum/10.0);
        if(num %2 == 0) {
        for(int j=0;j<=num;j++) {
        	System.out.print("+");
       }
    		System.out.println();
        }
        else {
        	for(int j=0;j<=num;j++) {
            	System.out.print("-");
           }
        		System.out.println();
            }
        }
        System.out.print("Average (" +average+ ") :" );
        for(int k=0;k<=average;k++) {
        
        	System.out.print("*");
        }
        
        
	}

}
