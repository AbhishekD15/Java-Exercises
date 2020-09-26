
import java.util.Random;
 
 
public class Computer extends Player {
    // This function helps the computer do the selection among ROCK,
    // PAPER,SCISSORS
    // we have used Random class from java.util.
    public String performMove() {
    		String[] choice = {"ROCK","PAPER","SCISSORS"};
        Random random = new Random();
        int input = random.nextInt(3);
        return choice[input];
    }
}