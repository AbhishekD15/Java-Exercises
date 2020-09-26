
public class PhysicalBook extends Book {
	private int shelf;
	private int aisle;
	private int floor;
	/**
	 * @return the shelf
	 */
	public int getShelf() {
		return shelf;
	}
	/**
	 * @param shelf the shelf to set
	 */
	public void setShelf(int shelf) {
		this.shelf = shelf;
	}
	/**
	 * @return the aisle
	 */
	public int getAisle() {
		return aisle;
	}
	/**
	 * @param aisle the aisle to set
	 */
	public void setAisle(int aisle) {
		this.aisle = aisle;
	}
	/**
	 * @return the floor
	 */
	public int getFloor() {
		return floor;
	}
	/**
	 * @param floor the floor to set
	 */
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public void displayBookLocation() {
		System.out.println("Location of the book: "+shelf+" shelf "+aisle+" aisle "+floor+" floor");
	}
	
	/* @param title
	 * @param year
	 * @param publish
	 * 
	 */
	public PhysicalBook(String title, int year, String publish) {
		this.title = title;
		this.year = year;
		this.publish = publish;
		System.out.println("Title: "+title+"\nYear: "+year+"\nPublicaction: "+publish);
		
	}
	
	/* 
	 * non parameterised constructor
	 */
	
	public PhysicalBook() {
		System.out.println("Inside Physical Book");
		
	}
	

}
