package com.yerenti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HttpErrorController {

    @RequestMapping(value="/errorPage/404.jsp")
    public String handle404() {
    	
    	return null;
    }

  

}