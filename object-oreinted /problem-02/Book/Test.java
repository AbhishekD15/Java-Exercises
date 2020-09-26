
public class Test {

	public static void main(String[] args) {
		EBook object1 = new EBook();
		EBook object2 = new EBook("Java 2: The Complete Reference,Third Edition",1994,"McGraw-Hill");
		object2.setUrl("www.McGrawHill.com");
		object2.setPages(1093);
		String website = object2.getUrl();
		System.out.println("URL of the EBook is: "+website);
		int pageNumber =object2.getPages();
		System.out.println("Number of pages: "+pageNumber);
		System.out.println();
		PhysicalBook object3 =new PhysicalBook();
		PhysicalBook object4 =new PhysicalBook("Engineering Hydrology,Second Edition",1996,"McGraw-Hill");
		object4.setShelf(3);
		object4.setAisle(2);
		object4.setFloor(1);
		object4.displayBookLocation();
		
		
		
	}

}
