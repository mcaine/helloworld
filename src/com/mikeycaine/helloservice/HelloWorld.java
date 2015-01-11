package com.mikeycaine.helloservice;

import javax.jws.WebService;

@WebService
public class HelloWorld {
	public String hello(String name) {
		return "Hello, " + name;
	}
}
