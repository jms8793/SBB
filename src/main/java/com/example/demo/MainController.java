package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@ResponseBody
	@GetMapping("/sbb")
	public String index() {
		return "안녕하세요. 정민상입니다.";
	}
	
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
}
