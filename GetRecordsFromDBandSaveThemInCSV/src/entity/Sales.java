package entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table
public class Sales {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	
	private int id;
	private String productName;
	private String productType;
	private int quantity;
	
	public Sales(int id, String productName, String productType, int quantity) {
		
		super();
		this.id = id;
		this.productName = productName;
		this.productType = productType;
		this.quantity = quantity;
		
	}
	
	public Sales() {
		
		super();
		
	}
	
	public int getId() {
		
		return this.id;
		
	}
	
	public String getProductName() {
		
		return productName;
		
	}
	
	public String getProductType() {
		
		return productType;
		
	}
	
	public int getQuantity() {
		
		return this.quantity;
		
	}
	
	public void setId(int id) {
		
		this.id = id;
		
	}
	
	public void setProductName(String productName) {
		
		this.productName = productName;
		
	}
	
	public void setProductType(String productType) {
		
		this.productType = productType;
		
	}
	
	public void setQuantity(int quantity) {
		
		this.quantity = quantity;
		
	}
	
	

}
