
public class Main {
	  public static void main(String[] args) throws InterruptedException {
		  
	        Referee rps = new Referee();//Staring the game
	        System.out.println("LOADING.....");
	        Thread.sleep(2000);//to get the feel of an arcade game
	        rps.getName();//Getting user name
	        rps.startGame();
	        
	    }
}


	   