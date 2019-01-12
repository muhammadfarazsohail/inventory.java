/**
 * Muhammad Faraz Sohail
 * Assignment 2
 */



public abstract class item {
	
	protected int item_id;
	protected double price;
	protected int qty;
	
	/**
	 * getters and setters
	 * @return
	 */
	public double getPrice() {
		return price;
	}
	
	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	/**
	 * display abstract method
	 */
	abstract void Display();
	
	/**
	 * purchased method
	 */
	public static void Purchased() {
		
		System.out.println("Purchased and removed the given quantity.");
		
	}

}
