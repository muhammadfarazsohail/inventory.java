

public class book extends item{
	
	String author;
	String title;
	int year;

	/**
	 * default constructor
	 */
public book() {
		author="not specified";
		title="not specified";
		year=0;
		
	}
	
/**
 * overloaded constructor
 * @param author
 * @param title
 * @param price
 * @param qty
 * @param year
 */
public book(String author, String title, double price, int qty, int year) {
		
	setAuthor(author);
	setTitle(title);
	setYear(year);
	setPrice(price);
	setQty(qty);
	}

/**
 * getters and setters
 * @return
 */
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	/**
	 * @Override of item class
	 */
	void Display() {
		
		System.out.print("\nBook\tAuthor: "+author+"\tTitle: "+title+"\tYear: "+year+"\tPrice: "+price+"\tQuantity: "+qty+"\tID: "+item_id+"\n");
		
	}

	
	
	

}
