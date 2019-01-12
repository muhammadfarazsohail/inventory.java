

public class gift extends item {
	
	String label;
	String manuf;
	int id,q;

	/**
	 * default constructor
	 */
	public gift() {
		
		label="Not specified";
		manuf="Not specified";
		
	}
	
	/**
	 * overloaded constructor
	 * @param label
	 * @param manuf
	 * @param price
	 * @param qty
	 */
	public gift(String label, String manuf, double price, int qty) {
		
		
		setLabel(label);
		setManuf(manuf);
		setPrice(price);
		setQty(qty);
	}
	
	/**
	 * getters and setters
	 * @return
	 */

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getManuf() {
		return manuf;
	}

	public void setManuf(String manuf) {
		this.manuf = manuf;
	}

	
	/**
	 * @Override of method in item class
	 */
	void Display() {
		System.out.print("\nGift\tLabel:"+label+"\tManufacturer:"+manuf+"\tPrice:"+price+"\tQuantity:"+qty+"\tID:"+item_id+"\n");
		
	}


}
