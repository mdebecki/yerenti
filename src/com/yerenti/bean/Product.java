package com.yerenti.bean;

public class Product {
	
	private String name; 
	
	private String offerHeader; 
	
	public Product(String pName,String pOfferHeader){
		this.name = pName;
		this.offerHeader = pOfferHeader;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOfferHeader() {
		return offerHeader;
	}

	public void setOfferHeader(String offerHeader) {
		this.offerHeader = offerHeader;
	}



}
