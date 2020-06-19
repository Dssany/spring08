package com.care.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.service.TestService;

@Controller
public class TessController {
	@Autowired
	private TestService service;
	@RequestMapping("test")
	public String test(Model model) {
		service.test(model);
		return "test";
	}
	
	@RequestMapping("input")
	public String input() {
		return "input";
	}
	
	@RequestMapping("list")
	public String list(Model model, @RequestParam String num) {
//		model.addAttribute("num",num);
		service.list(model,num);
		return "list";
	}
}
