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
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((expDate == null) ? 0 : expDate.hashCode());
		result = prime * result + ((groceryId == null) ? 0 : groceryId.hashCode());
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Groceries other = (Groceries) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (expDate == null) {
			if (other.expDate != null)
				return false;
		} else if (!expDate.equals(other.expDate))
			return false;
		if (groceryId == null) {
			if (other.groceryId != null)
				return false;
		} else if (!groceryId.equals(other.groceryId))
			return false;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		return true;
	}
	/**
	 * 
	 */
	public Groceries() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param groceryId
	 * @param items
	 * @param expDate
	 * @param brand
	 */
	public Groceries(String groceryId, Map<String, List<Map<String, Double>>> items, Instant expDate, String brand) {
		super();
		this.groceryId = groceryId;
		this.items = items;
		this.expDate = expDate;
		this.brand = brand;
	}
	
	
	
	
	
}
