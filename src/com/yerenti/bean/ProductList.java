package com.yerenti.bean;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

	private String filter;
	private static List<Product> product = new ArrayList<Product>();


	public ProductList() {
		// TODO Auto-generated constructor stub
		
        ProductList.product = new ArrayList<Product>();
		ProductList.product.add(new Product("Wiertarka", "Uniwersalna wiertarka Bosh"));
		ProductList.product.add(new Product("Wiertarka", "Uniwersalna wiertarka Bosh"));
		ProductList.product.add(new Product("Wiertarka", "Uniwersalna wiertarka Bosh"));
		ProductList.product.add(new Product("Wiertarka", "Uniwersalna wiertarka Bosh"));
		
	}

	public ProductList(String pFilter) {
		this.filter = pFilter;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String pFilter) {
		this.filter = pFilter;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		ProductList.product = product;
	};

}
