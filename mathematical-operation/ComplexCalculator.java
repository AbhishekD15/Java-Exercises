
public class ComplexCalculator { //creating class ComplexCalculator
	double i,j;	
	//constructors of class ComplexCalculator

	public ComplexCalculator(double i, double j) {
		this.i=i;
		this.j=j;
		
	}
	

	public ComplexCalculator() {
		// TODO Auto-generated constructor stub
	}
	 void Addition(ComplexCalculator firstObject, ComplexCalculator secondObject) {
			this.i = (firstObject.i+secondObject.i);
			this.j = (firstObject.i+secondObject.i);
			System.out.println("Addition of the two complex numbers ("+this.i+") + ("+this.j+")i" );
	}
	 void Subtraction(ComplexCalculator firstObject, ComplexCalculator secondObject) {
			this.i = (firstObject.i-secondObject.i);
			this.j = (firstObject.j-secondObject.j);
			System.out.println("Subtraction of the two complex numbers ("+this.i+") - ("+this.j+")i" );
			
	}
	  
	 void Multiplication(ComplexCalculator firstObject, ComplexCalculator secondObject) {
			  this.i = (firstObject.i * secondObject.i - firstObject.j * secondObject.j);
			  this.j = (firstObject.i * secondObject.i + firstObject.j * secondObject.j);
			  System.out.println("Multiplication of the two complex numbers ("+this.i+") * ("+this.j+")i" );
				
	}
	 void Division(ComplexCalculator firstObject, ComplexCalculator secondObject) {
		  double k;
		  k = (firstObject.i * secondObject.i) + (firstObject.j * secondObject.j);
		  this.i = ((firstObject.i * secondObject.i)+(firstObject.j * secondObject.j) /k);
		  this.j = ((firstObject.i * secondObject.i)-(firstObject.j * secondObject.j) /k);
		  System.out.println("Division of the two complex numbers ("+this.i+") * ("+this.j+")i" );
			
	}


	public static void main(String[] args) {
		
		ComplexCalculator  firstObject  = new ComplexCalculator(10,15); //creating first object of ComplexCalculator
 
		ComplexCalculator  secondObject  = new ComplexCalculator(8,9);//creating second object of ComplexCalculator
		
		ComplexCalculator objectResult = new ComplexCalculator() ;//creating third object of ComplexCalculator
	
		objectResult.Addition(firstObject,secondObject);//calling method Addition by passing object reference
		objectResult.Subtraction(firstObject,secondObject);//calling method Subtraction by passing object reference
		objectResult.Multiplication(firstObject,secondObject);//calling method Multiplication by passing object reference
		objectResult.Division(firstObject,secondObject);//calling method Division by passing object reference
	
	}
	
	
}
