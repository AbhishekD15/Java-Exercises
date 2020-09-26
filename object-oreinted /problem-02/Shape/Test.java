
public class Test {

	public static void main(String[] args) {
	
	Shape object = new Shape();
	
	
	
		
	Rectangle rectangleObject1=new Rectangle();	
	Rectangle rectangleObject2 =new Rectangle(9,5);
	System.out.println("Area:"+rectangleObject2.area());
	
	Triangle triangleObject1=new Triangle();
	Triangle triangleObject2 = new Triangle(12);
	triangleObject2.setHeight(10);
	System.out.println("Area:"+triangleObject2.area());
	
	Circle circleObject1=new Circle();
	Circle circleObject2 = new Circle(3);
	System.out.println("Area:"+circleObject2.area());
	
	
	
	}
}	
