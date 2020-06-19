package com.care.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.dao.TestDAO;
import com.care.dto.TestDTO;
@Service
public class TestService {
	@Autowired
	private TestDAO dao;
	
	public void test(Model model) {
		model.addAttribute("lists",dao.test());
	}
	
	public void list(Model model,String num) {
		model.addAttribute("list",dao.list(num));
	}
	
	

}
