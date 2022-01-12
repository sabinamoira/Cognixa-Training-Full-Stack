package com.ibm.thyme;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloWorldController {
	
	@GetMapping("/")
	public ModelAndView getIndex() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("name","rohan");
		return mav;
	}

}
