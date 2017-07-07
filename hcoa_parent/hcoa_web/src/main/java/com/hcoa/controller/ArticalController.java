package com.hcoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ArticalController {
	
	@RequestMapping("/dispatch")
	public String dispatch(){
		return "sendArticle/dispatch";
	}

}
