import java.util.*;


public class Human extends Player {
	
	public String performMove() {
		String choice;
        
		
        System.out.println("Select  ROCK  PAPER SCISSOR");
        Scanner sc = new Scanner(System.in);
        choice = sc.next();
        // checking user choice ignoring the case
        if (choice.equalsIgnoreCase("ROCK"))
            return "ROCK";
        else if (choice.equalsIgnoreCase("PAPER"))
            return "PAPER";
        else if (choice.equalsIgnoreCase("SCISSOR"))
            return "SCISSORS";
        else 
        		return null;
		
		
		
	}	
        	
		
        
        		
    
}
    
	
	

 
    

	


