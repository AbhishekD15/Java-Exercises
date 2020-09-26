
public class Book {
	
	private String title;
	private int year;
	private String publish;
	private int pages;
	
	
	/* @param title
	 * @param year
	 * @param publish
	 * @param pages
	 */
	public Book() {
	System.out.println("This is a non parameterised constructor");	
		
	}
	
	public Book(String title, int year, String publish, int pages) {
		this.title = title;
		this.year = year;
		this.publish = publish;
		this.pages = pages;
	}
	
	
	



	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the publish
	 */
	public String getPublish() {
		return publish;
	}

	/**
	 * @param publish the publish to set
	 */
	public void setPublish(String publish) {
		this.publish = publish;
	}

	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book object1 = new Book();
		Book object2 = new Book("Java 2: The Complete Reference,Third Edition",1994,"McGraw-Hill",1093);
		System.out.println("Details of the book:");
		System.out.println();
		System.out.println("Name: "+object2.getTitle());
		System.out.println("Year: "+object2.getYear());
		System.out.println("Publication: "+object2.getPublish());
		System.out.println("Number of pages: "+object2.getPages());

	}

}
