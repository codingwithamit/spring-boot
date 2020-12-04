package com.codingwithamit.springbootweb;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public String greeting() {
		return "Hello codingwithamit";
	}

}