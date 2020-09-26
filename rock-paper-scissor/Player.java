

import java.util.Scanner;
 
 public class Player {
	 
    private static String name;
    Scanner sc = new Scanner(System.in);
    
   /**
	 * @return the name
	 */
	public static String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public static void setName(String name) {
		Player.name = name;
	}

	/*
    * method to get the name of the user 
    */
  public void askName() {
        System.out.println("Please enter your name");
        name = sc.next();
    }

    public String performMove() {
    	return null;
    	
    }
 
  
}