
public class Triangle extends Shape {
	
	Triangle(double width){
		this.width=width;
		 
	}
	
	Triangle(){
		System.out.println("This is a normal constructor inside Triangle class");
	}

	
	double area() {
		System.out.println("Inside Triangle class");
		
		return (width*height)/2;
	}

}
