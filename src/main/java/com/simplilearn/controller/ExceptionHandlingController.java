package com.simplilearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionHandlingController {

	/*
	 * @ExceptionHandler(value=Exception.class) public String arithmaticHandler() {
	 * return "Internal error occurred, please contact to administrator"; }
	 */

	@GetMapping("/calculate")
	public Integer calculate() {
		int a = 6;
		int b = 0;

		int result = a / b;
		return result;
	}

}
