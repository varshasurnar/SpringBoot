package com.zensar.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCOntroller {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String sHello() {
		System.out.println("Hello");
		return "hello";
	}
}
