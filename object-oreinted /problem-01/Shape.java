
public class Shape {
	private double width;
	private double height;
	private double radius;
	private double length;
	 
	public Shape() {
		System.out.println("This is a non parameterised constructor");
			
	}
	
	/**
	 * @param widht
	 * @param height
	 * @param radius
	 * @param length
	 */
	public Shape(double width, double height, double radius, double length) {
		this.width = width;
		this.height = height;
		this.radius = radius;
		this.length = length;
	}



	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}


	/**
	 * @param widht the width to set
	 */
	public void setWidht(double width) {
		this.width = width;
	}


	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}


	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}


	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}


	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}


	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}


	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	double volumeRectangle() {
		return width*height*length;
	}
	double volumeCircle() {
		return 3.14 * Math.pow(radius, 2);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape object1 = new Shape();
		Shape object2 = new Shape(11.0,12.0,27.0,9.0);
		
		System.out.println("Volume of the rectangle is: "+object2.volumeRectangle());
		System.out.println("Volume of the circle is: "+object2.volumeCircle());
	}

}
