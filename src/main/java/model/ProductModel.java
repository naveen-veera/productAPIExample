package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductModel {

	@Id
	private String productId;
	private String productName;
	private String productDesc;
	private int price;
	
	public ProductModel(String productId, String productName, String productDesc, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.price = price;
	}
	
	public ProductModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
