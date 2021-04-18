package Ex1;

import java.io.Serializable;

public class ItemProduct implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int itemProductId;
	private String name;
	private float price;
	
	public void setItemProductid( int itemProductId) {
		
		this.itemProductId = itemProductId;
	}
	
	public int getitemproductId() {
		
		return this.itemProductId;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(float price) {
		
		this.price = price;
	}
	
	public float getPrice() {
		return this.price;
	}

}
