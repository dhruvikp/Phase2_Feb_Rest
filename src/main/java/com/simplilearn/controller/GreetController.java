package com.simplilearn.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.model.Greet;

@RestController
public class GreetController {

	/* @GetMapping("/greet") */
	@RequestMapping(method = RequestMethod.GET, value = "/greet", produces = MediaType.APPLICATION_JSON_VALUE)
	public Greet greeting() {
		Greet greet = new Greet();

		greet.setMessage("Welcome to simplilearn");
		greet.setName("Dhruvik");

		return greet;
	}

}
