package com.cleaningshop.dto;

import com.cleaningshop.model.Category;
import com.cleaningshop.model.Product;

public class ProductCategory {
	private Product product;
	private Category category;
	
	public ProductCategory() {}

	public ProductCategory(Product product, Category category) {
		super();
		this.product = product;
		this.category = category;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "ProductCategory [product=" + product + ", category=" + category + "]";
	}
	
	
	
}
