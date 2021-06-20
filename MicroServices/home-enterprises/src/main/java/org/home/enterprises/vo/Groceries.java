package org.home.enterprises.vo;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.Map;

public class Groceries implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5159929499921381270L;
	
	private String groceryId;
	private Map<String, List<Map<String,Double>>> items;
	private Instant expDate;
	private String brand;
	
	
	/**
	 * @return the groceryId
	 */
	public String getGroceryId() {
		return groceryId;
	}
	/**
	 * @param groceryId the groceryId to set
	 */
	public void setGroceryId(String groceryId) {
		this.groceryId = groceryId;
	}
	/**
	 * @return the items
	 */
	public Map<String, List<Map<String, Double>>> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(Map<String, List<Map<String, Double>>> items) {
		this.items = items;
	}
	/**
	 * @return the expDate
	 */
	public Instant getExpDate() {
		return expDate;
	}
	/**
	 * @param expDate the expDate to set
	 */
	public void setExpDate(Instant expDate) {
		this.expDate = expDate;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Groceries [groceryId=" + groceryId + ", items=" + items + ", expDate=" + expDate + ", brand=" + brand
				+ "]";
	}
	
	
	
}
