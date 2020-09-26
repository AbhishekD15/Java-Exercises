import java.util.Scanner;

public class DeterminantCalculator {
	
	public int N;
	//method to calculate determinant
	public  int determinant(int matrix[][], int N){
		int det=0;
		this.N=N;
		for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
		if (N == 1) 
            return matrix[0][0];
		else if(N ==2) {
			det= matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
		}
		else if(N == 3) {
			det = (matrix[0][0]*(matrix[1][1]*matrix[2][2] - matrix[2][1]*matrix[1][2] ) - 
					matrix[0][1]*(matrix[1][0]*matrix[2][2] - matrix[2][0]*matrix[1][2] ) +
					matrix[0][2]*(matrix[1][0]*matrix[2][1] - matrix[2][0]*matrix[1][1]));
					
		}
		else {
			System.out.println("Out of scope");
		}
            }
        }    
		
		return det;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeterminantCalculator ob = new DeterminantCalculator(); // creating object of DeterminantCalculator
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Matrix Determinant Calculator!");
		System.out.println("Would you like to calculate the determinant of a new matrix?");
		System.out.println("1. Yes, 2. No");
		int choice = input.nextInt();
		
		switch (choice) {
			
		case 1:System.out.println("Option: 1");
			   System.out.println("What is the dimesnion of the square matrix");
			   int N = input.nextInt();
			   System.out.println("Input: "+N+"x"+N);
			   System.out.println("Great! Let's calculate this determinant then.");
			   System.out.println("Please insert all the values for your matrix.");
			   int[][] matrix = new int[N][N]; //input elements of the matrix
			   for (int i = 0; i < N; i++)
		          {
		              for (int j = 0; j < N; j++)
		              {
		            	  matrix[i][j] = input.nextInt();
		              }
		          }   
			   System.out.println("New matrix:");//print matrix
			   for (int i = 0; i < N; i++)
			   {
				   System.out.print("|");
		          
		              for (int j = 0; j < N; j++)
		              {
		            	  
						System.out.print(" "+matrix[i][j]+" ");
		              }
		           System.out.print("|");   
		           System.out.println();
		          } 
			   System.out.print("Determinant  of the matrix is : "+ ob.determinant(matrix, N));//calling method determinant
	             
	    break;
			   
			   
			   
		case 2:System.out.println("Have a nice day");
		break;
		}
		
		
		
		
		
		
		
		input.close();

	}

	

}
