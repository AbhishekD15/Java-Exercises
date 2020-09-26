public class Referee { 
	//Instance variables declaration
	Player player= new Player();
	Human human = new Human();
	Computer computer = new Computer();
	
	//Default Constructor initializing the instance variables
	 public Referee() {
		 System.out.println("LETS START THE GAME");
	 }
	 
	 public void getName() {
		 player.askName();
	 }
	 public void display(String who, String s) {
	    	try {
	        switch (s) {
	        case "ROCK":
	            System.out.println(who + " selected ROCK   ");
	            break;
	        case "PAPER":
	            System.out.println(who + " selected PAPER   ");
	            break;
	        case "SCISSORS":
	            System.out.println(who + " selected SCISSORS   ");
	            break;
	        default:
	        		
	            break;
	        }
	    	}
	    	catch(Exception e) {
	    		System.out.println("Invalid choice.Play Again");
	    		System.exit(1);
	    }
	}
	    
	/*
	 * method to compare the choices   
	 */
	public static int compare(String userSelection, String computerSelection) { 
		if(userSelection==computerSelection) 
	        		return 0;
	    switch (userSelection) {
	        case "ROCK":
	            return (computerSelection == "SCISSORS" ? 1 : 2);
	 
	        case "PAPER":
	            return (computerSelection == "ROCK" ? 1 : 2);
	 
	        case "SCISSORS":
	            return (computerSelection =="PAPER" ? 1 : 2);
	     }
	        return 0;
	}
	    
	public void startGame() {
		
		//human player's move
		String playerInput = human.performMove();
	    display(human.getName(),playerInput);
	    //computer's move    
	    String computerInput = computer.performMove();
	    display("Computer", computerInput);
	    
	   // Compare moves and determine winner
	   int compareResult=Referee.compare(playerInput, computerInput);
	   switch (compareResult) {
	   	case 0: // Tie
	            System.out.println("It's a tie!");
	            break;
	    case 1: // human wins
	            System.out.println(player.getName()+ " beats " + "computer" +"\n You won!");
	            break;
	    case 2: // Computer wins
	            System.out.println("Computer" +" beats "+ player.getName()+"\n You Lost!");
	            break;
	        }
	        
	}

}
