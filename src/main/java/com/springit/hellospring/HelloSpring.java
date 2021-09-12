package com.springit.hellospring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpring {
	
	@RequestMapping("/")
	public String sayHi() {
		return "Simplest Spring App running with actuator checks at /actuator";
	}
}
