import java.util.Scanner; // importing scanner class
public class SumOperation {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome dear user!");
		System.out.println("Would you like to: ");
		System.out.println("a) sum  \n" + "b) exit \n");
		char option = input.next().charAt(0); // taking input for user interface
		while(option == 'a') {
			System.out.println("Please, insert the first number");
			int number_a = input.nextInt(); //input first integer
			System.out.println("Please, insert the second number");
			int number_b = input.nextInt();// input second integer
			int sum = number_a + number_b;
			System.out.println("Thank you for your enquiry, the sum between "+number_a+" and "+number_b+" is "+sum);
			System.out.println("Welcome dear user!");
			System.out.println("Would you like to: ");
			System.out.println("a) sum again \n" + "b) exit \n");
			 option = input.next().charAt(0);




		}
		System.out.println("Thank you! Have a good day.a");



		input.close();
	}

}
