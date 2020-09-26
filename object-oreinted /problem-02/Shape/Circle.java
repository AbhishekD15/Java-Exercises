
public class Circle extends Shape {
	
	Circle(double radius){
		this.radius=radius;
	}
	Circle(){
		System.out.println("This is a normal constructor in Circle Class");
	}
	
	double area() {
		System.out.println("Inside Circle class");
		return radius*radius;
	}

}
