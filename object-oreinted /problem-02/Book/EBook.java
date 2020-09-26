
public class EBook extends Book {
	private String url;

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/* @param title
	 * @param year
	 * @param publish
	 * 
	 */
	public EBook(String title, int year, String publish) {
		this.title = title;
		this.year = year;
		this.publish = publish;
		System.out.println("Title: "+title+"\nYear: "+year+"\nPublicaction: "+publish);
		
	}
	
	/* 
	 * non parameterised constructor
	 */
	
	public EBook() {
		System.out.println("Inside EBook");
		
	}

}
