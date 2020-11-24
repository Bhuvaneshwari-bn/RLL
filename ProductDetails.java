package com.ecom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="product_details")
public class ProductDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productDetailId;
	private Integer productId;
	private String propertyName;
	private String propertyValue;
	
	public ProductDetails() {
		
	}

	public ProductDetails(Integer productDetailId, Integer productId, String propertyName, String propertyValue) {
		super();
		this.productDetailId = productDetailId;
		this.productId = productId;
		this.propertyName = propertyName;
		this.propertyValue = propertyValue;
	}

	public Integer getProductDetailId() {
		return productDetailId;
	}

	public void setProductDetailId(Integer productDetailId) {
		this.productDetailId = productDetailId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getPropertName() {
		return propertyName;
	}

	public void setPropertName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

	@Override
	public String toString() {
		return "ProductDetails [productDetailId=" + productDetailId + ", productId=" + productId + ", propertyName="
				+ propertyName + ", propertyValue=" + propertyValue + "]";
	}
	
	

}
