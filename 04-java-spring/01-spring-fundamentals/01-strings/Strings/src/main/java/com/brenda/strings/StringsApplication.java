package com.brenda.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "Hello Client! How are you doing?";
	}
	
	@RequestMapping(value="/random", method=RequestMethod.GET)
	public String random() {
		return "Spring Boot is great! So easy to just repond with strings";
	}

}
