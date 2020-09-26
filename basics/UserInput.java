import java.util.Scanner; // import statement used to import Scanner class from java.util package

public class UserInput{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in); // variable craeted of Scanner type
	
	/* user is asked to provide input with the help pf input.next()*/

	System.out.println("Enter the name of the user");
	String name = input.next();//next() is used to take input from the users
	System.out.println("The name of the user is " + name);

	System.out.println("Enter the age of the user");
	int age = input.nextInt();
	System.out.println("The age of the user is " + age);

	System.out.println("Enter favourite food of the user");
	String favFood = input.next();
	System.out.println("The Favourite food of the user is " + favFood);

	System.out.println("Enter his grade in Maths");
	char grade_01 = input.next().charAt(0);
	System.out.println("His grade in Maths is " + grade_01);

	System.out.println("Enter his grade in English");
	char grade_02 = input.next().charAt(0);
	System.out.println("His grade in English is " + grade_02);

	System.out.println("Enter the height of the user");
	float height = input.nextFloat();
	System.out.println("The height of the user is " + height);

	System.out.println("Enter the weight of the user");
	float weight = input.nextFloat();
	System.out.println("The weight of the user is " + weight);

	System.out.println("Enter the total number of subjects ");
	int numberOfSubjects = input.nextInt();
	System.out.println("The total number of subjects is " + numberOfSubjects);

	input.close();// close() is used to avoid leakage


	}

}
