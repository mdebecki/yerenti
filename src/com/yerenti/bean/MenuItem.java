package com.yerenti.bean;

import java.util.List;

public class MenuItem {

	private String name ; 
    private List<MenuItem> childItems;
    private String URL; 
    
 
	public List<MenuItem> getChildItems() {
		return childItems;
	}
	public void setChildItems(List<MenuItem> childItems) {
		this.childItems = childItems;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	} 
	
	
	
}
