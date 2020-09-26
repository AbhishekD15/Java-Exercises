import java.util.Scanner;//importing scanner class

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("how much cash do you want to withdraw");
		int cash = input.nextInt();// input the amount of cash
		
		String message = run(cash);// calling method run
		
		System.out.println(message);
		input.close();
		
	}
	//run method block
	public static String run(int cash) {
		int r=0,q=0;
		String message;
		
		
	
		if(cash % 50 == 0) {
			 r = cash /50;
			 
			 message = "Here is " +q+ " $20 notes and "+r+ " $50 notes";
			 
		}
		
		else if((cash%50) % 20 == 0) {
			 q = (cash%50) /20;
			 r = cash / 50;
			 message = "Here is " +q+ " $20 notes and "+r+ " $50 notes"; 
		}
		
		else if(cash % 20 == 0) {
			 q = cash / 20;
			 message = "Here is " +q+ " $20 notes and "+r+ " $50 notes";
		}
		else {
			
			message="Sorry, the value you input cannot be withdrew";
				
	
				
		}
		

	return message;

}
}



