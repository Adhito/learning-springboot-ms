package com.learningspringbootms.limitsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningspringbootms.limitsservice.bean.Limits;

@RestController
public class LimitsController {

	@GetMapping("/limits")
	public Limits retreiveLimits() {
		return new Limits(1,1000);
	}
}
