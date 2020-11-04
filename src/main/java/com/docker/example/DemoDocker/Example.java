package com.docker.example.DemoDocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {
	
	@RequestMapping("/home")
	public String sample() {
		return "helloworld";
	}

}
