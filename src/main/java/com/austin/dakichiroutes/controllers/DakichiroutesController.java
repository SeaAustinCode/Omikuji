package com.austin.dakichiroutes.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DakichiroutesController {

	@RequestMapping("/daikichi")
	public String welcome() {
		return "Welcome";
	}
	
	@RequestMapping(value="/daikichi/today", method=RequestMethod.GET)
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping(value="/daikichi/tomorrow", method=RequestMethod.GET)
	public String tomorrow() {
		return "Tomorrow, an opportunity will arrise, so be sure to be open to new ideas!";
	}
	
	 @RequestMapping("/daikichi/travel/{location}")
	    public String travellocation(@PathVariable("location") String location){
	    	return "Congratulations you will soon travel to " + location;
	}
	    
	 
	 @RequestMapping("/daikichi/lotto/{lottonumber}")
	    public String lottonumber(@PathVariable("lottonumber") int lottonumber){
		 	if (lottonumber % 2 == 0) {
	    	return "You will take a grand journey in the near future but, be wary of tempting offers.";
		 	}
	 		return "You have enjoyed the fruits of your labor but now is a great time to spend time with your family and friends.";
	 }
	 
}
