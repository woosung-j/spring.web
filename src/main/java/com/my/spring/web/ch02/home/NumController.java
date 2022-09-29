package com.my.spring.web.ch02.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch02/home")
public class NumController {
	@GetMapping("numIn")
	public String randomIn() {
		return "ch02/home/numIn";
	}
	
	@GetMapping("numOut")
	public String randomOut(Number num) {
		return "ch02/home/numOut";
	}
}
