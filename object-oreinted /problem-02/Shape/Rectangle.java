
public class Rectangle extends Shape {
	
	Rectangle(double length,double width){
		super(length,width);
	}
	
	Rectangle(){
		System.out.println("This is a normal constructor in Recatangle Class");
	}
	
	
	double area() {
		
		System.out.println("Inside Recatngle Class");
		
		return length*width;
	}
	
	


}
