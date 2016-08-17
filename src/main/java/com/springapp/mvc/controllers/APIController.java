package com.springapp.mvc.controllers;


import com.springapp.mvc.model.ContentWrapper;
import com.springapp.mvc.model.User;
import com.springapp.mvc.service.QuestionsService;
import com.springapp.mvc.service.QuestionsServiceImpl;
import com.springapp.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

//this is a rest api that needs to accept json input which will have user info, question, and the answer. Needs
// to be able to verify if the applicant passes min qualifications or not.

@RestController
@RequestMapping("/submitForm")
public class APIController {

	@Autowired
	private UserService userService;
	@Autowired
	private QuestionsService questionsService;

	private String answer;

	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	public void submitApplication(@ModelAttribute User user) {
		RestTemplate rest = new RestTemplate();
		String url = "http://localhost:8080/";
		System.out.println("trying..................");
		rest.postForObject(url, user, User.class);
		System.out.println("try again");
	}



//	@RequestMapping(method = RequestMethod.GET)
//	public String testHibernateGet(ModelMap model) {
//		return "testhibernateget";
//	}
//
//	@RequestMapping(value = "/testhibernate", method = RequestMethod.POST)
//	public String testHibernate(@ModelAttribute("user") User user) {
//		service.saveUser(user);
//		return "testhibernate";
//	}
}