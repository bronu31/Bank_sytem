package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Next_pageController {
	
	@GetMapping("/next_page")
	public String next_page(@RequestParam(name="name", required=false, defaultValue="next page") String name, Model model) {
		model.addAttribute("name", name);
		return "next_page";
	}

}
