package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

//Class to get food inventory and supply inventory details into the respective tables of the database
//FoodInventory and SupplyInventory inherit from this class

@MappedSuperclass
public abstract class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private int inventory_id;
	String itemName;
	int itemQuantity;
	Boolean needsToBeOrdered;
	
	public Inventory()
	{
	}
	
	public Inventory(int inventory_id, String itemName, int itemQuantity, Boolean needsToBeOrdered) {
		super();
		this.inventory_id = inventory_id;
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.needsToBeOrdered = needsToBeOrdered;
	}
	
	public int getInventory_id() {
		return inventory_id;
	}
	public void setInventory_id(int inventory_id) {
		this.inventory_id = inventory_id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public Boolean getNeedsToBeOrdered() {
		return needsToBeOrdered;
	}
	public void setNeedsToBeOrdered(Boolean needsToBeOrdered) {
		this.needsToBeOrdered = needsToBeOrdered;
	}
	
	public abstract void updateInventory(int itemNum,int numSupplies);
	public abstract List<Inventory> getInventoryTable();
}
