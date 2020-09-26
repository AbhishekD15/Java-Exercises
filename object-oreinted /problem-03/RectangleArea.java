
public class RectangleArea extends Rectangle {
	
	public RectangleArea(int width, int height) {
		super(width, height);
		
	}

	public void read_input() {
		String s1=""+width;
		String s2=""+height;
		System.out.println(s1+" "+s2);
		
	}
	
	public void display() {
		System.out.println(width*height);
		
	}
	

}
