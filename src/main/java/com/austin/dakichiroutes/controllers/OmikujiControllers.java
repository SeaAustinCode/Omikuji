package com.austin.dakichiroutes.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiControllers {

	 @RequestMapping("/omikuji")
	 public String omikuji(HttpSession session) {
		 return "omikuji.jsp";
	 }
	 
	 @RequestMapping("/omikujiform")
	 public String omikujiform(HttpSession session) {
		 return "omikujiform.jsp";
	 }
	 
	 
	 @RequestMapping(value="/processForm", method=RequestMethod.POST)
	 public String processForm(@RequestParam(value="number") Integer number,
			 				   @RequestParam(value="city") String city,
			 				   @RequestParam(value="realPerson") String realPerson,
			 				   @RequestParam(value="hobby") String hobby,
			 				   @RequestParam(value="livingThing") String livingThing,
			 				   @RequestParam(value="somethingNice") String somethingNice,
			 				   HttpSession session) {
		 			 session.setAttribute("number", number);
			 session.setAttribute("city", city);
			 session.setAttribute("realPerson", realPerson);
			 session.setAttribute("hobby", hobby);
			 session.setAttribute("livingThing", livingThing);
			 session.setAttribute("somethingNice", somethingNice);
			 return "redirect:/omikuji";
	 }
	 
}
