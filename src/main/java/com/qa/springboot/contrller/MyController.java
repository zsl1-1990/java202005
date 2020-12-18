package com.qa.springboot.contrller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@RequestMapping("/a")
	@ResponseBody
	public String show(){
		
		return "Hello World";
	}

}
