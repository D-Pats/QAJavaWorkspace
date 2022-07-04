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
		return "<html>\r\n"
				+ " <head>\r\n"
				+ "<title>Test Page Stuff</title>"
				+ "     <style>\r\n"
				+ "         div {\r\n"
				+ "             width: 300px;\r\n"
				+ "             background-color: #b0e0e6;\r\n"
				+ "         }\r\n"
				+ "     </style>\r\n"
				+ " </head>\r\n"
				+ " <body>\r\n"
				+ "     <div>\r\n"
				+ "         <p>In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.</p>\r\n"
				+ "         <p>'Whenever you feel like criticizing anyone,' he told me, 'just remember that all the people in this world haven't had the advantages that you've had.'</p>\r\n"
				+ "     </div>\r\n"
				+ " </body>\r\n"
				+ " </html>";
	}
}
