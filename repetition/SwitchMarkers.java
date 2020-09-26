import java.util.Random;

public class SwitchMarkers {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    char c = 0;
			Random ran = new Random(); 
	        
	        
	  
	        // generating integer 
	        int num = ran.nextInt(20);
	        if( num>0 && num <=5)
	        	c='o';
	        else if (num>5 && num<=10)
	       	c='x';
	        else if (num>10 && num<=15)
	        	c='s';
	        else if(num >15)
	        	c='*';
	        
	        switch(c) {
	        
	        case '0': for(int j=0;j<=num;j++) {
		              	System.out.print(c);
		             }
	        			break;
	        
	        case 'x': for(int j=0;j<=num;j++) {
              			System.out.print(c);
             		}
    					break;
	        
	        case 's': for(int j=0;j<=num;j++) {
      					System.out.print(c);
     					}
					break;
	        
	        case '*': for(int j=0;j<=num;j++) {
      					System.out.print(c);
     				}
					break;
	        
	        default : System.out.println("Invalid entry");
	        }
	        
	        
	        
	        
	     

	}

}

