
public class Book {
	public String title;
	public int year;
	public String publish;
	public int pages;
	
	
	/* @param title
	 * @param year
	 * @param publish
	 * @param pages
	 */
	public Book() {
		title="";
		year=0;
		publish="";
		pages=0;
		
	}
	
	/* @param title
	 * @param year
	 * @param publish
	 * 
	 */
	
	public Book(String title, int year, String publish) {
		this.title = title;
		this.year = year;
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
		this.pages=pages;
	}	

}
