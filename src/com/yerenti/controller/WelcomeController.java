package com.yerenti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yerenti.bean.ProductList;
import com.yerenti.util.XMLContent;


@Controller

public class WelcomeController {

	@RequestMapping("/welcome")
	public String welcome(ModelMap model) {

		XMLContent xmlMenu = new XMLContent();

		model.addAttribute("menu", xmlMenu.getMenuList());

		ProductList pList = new ProductList();
		pList.setFilter(null);

		model.addAttribute(pList);

		
		System.out.println("Welcome");
		
		return "welcome";
	}

}
