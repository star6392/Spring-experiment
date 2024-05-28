package com.myapp.spring.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PRODUCT_ID")
	private Integer productId;
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@Column(name="PRODUCT_PRICE")
	private Double price;
	
	
	@Column(name="PRODUCT_IMAGE_URL")
	private String imageUrl;
	
	@Column(name="PRODUCT_AVAILABLE")
	private String productAvailable;
	
	@Column(name="PRODUCT_STAR_RATING")
	private Double starRating;
	
	@Column(name="PRODUCT_CODE")
	private String productCode;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	

	public String getProductAvailable() {
		return productAvailable;
	}

	public void setProductAvailable(String productAvailable) {
		this.productAvailable = productAvailable;
	}

	public Double getStarRating() {
		return starRating;
	}

	public void setStarRating(Double starRating) {
		this.starRating = starRating;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(imageUrl, price, productAvailable, productCode, productId, productName, starRating);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		return Objects.equals(imageUrl, other.imageUrl) && Objects.equals(price, other.price)
				&& Objects.equals(productAvailable, other.productAvailable)
				&& Objects.equals(productCode, other.productCode) && Objects.equals(productId, other.productId)
				&& Objects.equals(productName, other.productName) && Objects.equals(starRating, other.starRating);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [productId=");
		builder.append(productId);
		builder.append(", productName=");
		builder.append(productName);
		builder.append(", price=");
		builder.append(price);
		builder.append(", imageUrl=");
		builder.append(imageUrl);
		builder.append(", productAvailable=");
		builder.append(productAvailable);
		builder.append(", starRating=");
		builder.append(starRating);
		builder.append(", productCode=");
		builder.append(productCode);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	

}
