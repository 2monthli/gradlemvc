package me.ai.scaffold.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/test")
	public String test(){
		return "test";
	}
	
	@GetMapping("index")
	public String index(){
		return "index";
	}
	
	@GetMapping("pic")
	public String pic(){
		return "pic";
	}
}
