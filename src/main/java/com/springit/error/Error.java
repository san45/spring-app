package com.springit.error;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Error {

	@RequestMapping("/Error")
	public String showError() {
		return "Simple Error Message";
	}
}
