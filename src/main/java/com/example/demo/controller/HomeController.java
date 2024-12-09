package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.demo.model.Product;
import com.example.demo.serviceInter.ProductServiceInter;

@Controller
public class HomeController {
	@Autowired
	ProductServiceInter service;
	@RequestMapping(value = "/")
	public String landingPage() {
		return "index";
	}
	@RequestMapping(value = "/reg")
	public String regPage() {
		return "register";
	}
	@RequestMapping(value = "/register")
	public String registerPage(@ModelAttribute Product prod,Model m) {
		service.saveData(prod);
		System.out.println("Data store in table");
		m.addAttribute("data",prod);
		return "login";
	}
	
	@RequestMapping(value = "/log")
	public String logPage() {
		return "login";
	}
	@RequestMapping(value = "/login")
	public String loginPage(@RequestParam String puname,@RequestParam String pwd,Model m) {
		Product prod=service.loginCheck(puname,pwd);
		if(prod!=null)
		{
			    List<Product> prodAlldata=service.getAllData();
			    m.addAttribute("data", prodAlldata);
			    return "success";
			    
		}
		return "login";
	}
	@RequestMapping(value ="/delete")
	public String deletePage(@RequestParam int pid,Model m) {
//		System.out.println("on first line of request mapping");
		service.deleteData(pid);
//		System.out.println("data deleted successfully");
		List<Product> productdata=service.getAllData();
		m.addAttribute("data",productdata);
		return "success";
	}
	
	@RequestMapping(value ="/update")
	public String updatePage(@RequestParam int pid,Model m) {
		Product prodUpdate=service.updateData(pid);
		m.addAttribute("data",prodUpdate);
		return "edit";
	}
	
	@RequestMapping(value ="/edit")
	public String editPage(@ModelAttribute Product prod,Model m) {
		service.saveData(prod);
		List<Product> prodEdit=(List<Product>)service.getAllData();
		m.addAttribute("data",prodEdit);
		return "success";
	}
	
	
}
