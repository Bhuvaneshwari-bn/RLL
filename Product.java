package com.ecom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	private Long skuCode;
	private String  productBrand;
	private String productName;
	private String productDescription;
	private Integer supplierId;
	private Integer categoryId;
	private Double unitPrice;
	private Double MRP;
	private Double discount;
	private Integer inStockQty;
	private Integer isAvailable;
	private Integer discountAvailable;
	private String imageUrl;
	
	public Product() {
		
	}

	public Product(Integer productId, Long skuCode, String productBrand, String productName, String productDescription,
			Integer supplierId, Integer categoryId, Double unitPrice, Double mRP, Double discount, Integer inStockQty,
			Integer isAvailable, Integer discountAvailable, String imageUrl) {
		super();
		this.productId = productId;
		this.skuCode = skuCode;
		this.productBrand = productBrand;
		this.productName = productName;
		this.productDescription = productDescription;
		this.supplierId = supplierId;
		this.categoryId = categoryId;
		this.unitPrice = unitPrice;
		MRP = mRP;
		this.discount = discount;
		this.inStockQty = inStockQty;
		this.isAvailable = isAvailable;
		this.discountAvailable = discountAvailable;
		this.imageUrl = imageUrl;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Long getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(Long skuCode) {
		this.skuCode = skuCode;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getMRP() {
		return MRP;
	}

	public void setMRP(Double mRP) {
		MRP = mRP;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Integer getInStockQty() {
		return inStockQty;
	}

	public void setInStockQty(Integer inStockQty) {
		this.inStockQty = inStockQty;
	}

	public Integer getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Integer isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Integer getDiscountAvailable() {
		return discountAvailable;
	}

	public void setDiscountAvailable(Integer discountAvailable) {
		this.discountAvailable = discountAvailable;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", skuCode=" + skuCode + ", productBrand=" + productBrand
				+ ", productName=" + productName + ", productDescription=" + productDescription + ", supplierId="
				+ supplierId + ", categoryId=" + categoryId + ", unitPrice=" + unitPrice + ", MRP=" + MRP
				+ ", discount=" + discount + ", inStockQty=" + inStockQty + ", isAvailable=" + isAvailable
				+ ", discountAvailable=" + discountAvailable + ", imageUrl=" + imageUrl + "]";
	}

	
}
