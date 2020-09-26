import java.util.*; 
public class NextInteger {

	public static void main(String[] args) {
		int sum = 0;
		
		// TODO Auto-generated method stub
		

        // create random object 
        Random ran = new Random(); 
        for(int i = 0;i <10; i++)
        {
  
        // generating integer 
        int num = ran.nextInt(20); 
  
        // adding the random integer and assigning to variable sum
        sum=sum+num;
       
        
        float average= (float) (sum/10.0);
        System.out.println("mean of random 10 integers is" + average );
    


	}
}
}
	
	
	  