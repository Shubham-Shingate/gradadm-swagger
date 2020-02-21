package com.swagger.gradadmswagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class SwaggerController {

	@GetMapping("/hello-swagger")
	public String hello() {
		return "Hello Swagger";	
	}
}
