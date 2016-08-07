package com.yerenti.controller;

import com.yerenti.bean.*;
import com.yerenti.util.XMLContent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * author: Crunchify.com
 * 
 */

@Controller
public class SearchController {



	@RequestMapping(value = "/product-list", method = RequestMethod.POST)
	public ModelAndView post_product_list(@RequestParam("search") String pFilter) {

		return new ModelAndView("product-list", "search", pFilter);

	}

	@RequestMapping(value = "/product-list", method = RequestMethod.GET)
	public ModelAndView get_product_list(@RequestParam("search") String pFilter, ModelMap model) {

		XMLContent xmlMenu = new XMLContent();
		model.addAttribute("menu", xmlMenu.getMenuList());

		ProductList pList = new ProductList();
		pList.setFilter(pFilter);

		return new ModelAndView("product-list", "productList", pList);
	}

	@RequestMapping("/checkout")
	public ModelAndView checkout() {

		return null;
	}

	@RequestMapping("/product-details")
	public ModelAndView product_details() {

		return null;
	}

	@RequestMapping("/cart")
	public ModelAndView cart() {

		return null;
	}

	@RequestMapping("/login")
	public ModelAndView login() {

		return null;
	}

	@RequestMapping("/blog")
	public ModelAndView blog() {

		return null;
	}

	@RequestMapping("/blog-single")
	public ModelAndView blog_single() {

		return null;
	}

	@RequestMapping("/contact-us")
	public ModelAndView contact_us() {

		return null;
	}

	@RequestMapping("/header")
	public ModelAndView header() {

		return null;
	}
}