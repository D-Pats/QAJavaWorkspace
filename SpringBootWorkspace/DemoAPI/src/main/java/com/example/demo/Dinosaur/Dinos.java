package com.example.demo.Dinosaur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dinos {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "<h1>Hello, World!</h1>";
	}
	
	@GetMapping("/test")
	public String testPage() {
		return "<div><h1>Hello, World!</h1></div><div><p>Some para text</p></div>";
	}
}
