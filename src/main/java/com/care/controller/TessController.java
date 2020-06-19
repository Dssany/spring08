package com.care.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.dto.TestDTO;
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
	
	@RequestMapping("inputuser")
	public String lnputuser() {
		return "inputuser";
	}
	@RequestMapping("savedata")
	public String savedata(TestDTO dto) {
		System.out.println("num : " + dto.getNum());
		System.out.println("name : " + dto.getName());
		System.out.println("mydate : " + dto.getMydate());
		service.savedata(dto);
		
		return "redirect:test";
	}
	@RequestMapping("main")
	public String main() {
		return "main";
	}
	
	@RequestMapping("updatedata")
	public String updatedata(TestDTO dto) {
		service.updatedata(dto);
		return "redirect:test";
	}
	@RequestMapping("updatepage")
	public String updatepage(@RequestParam int num,Model model) {
		service.updatepage(model,num);
		return "update";
	}
	
	
}
