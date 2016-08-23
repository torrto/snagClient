package com.springapp.mvc.controllers;


import com.springapp.mvc.model.ContentWrapper;
import com.springapp.mvc.model.Questions;
import com.springapp.mvc.model.User;
import com.springapp.mvc.service.QuestionsService;
import com.springapp.mvc.service.QuestionsServiceImpl;
import com.springapp.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;

//this is a rest api that needs to accept json input which will have user info, question, and the answer. Needs
// to be able to verify if the applicant passes min qualifications or not.

@RestController
@RequestMapping("/submitForm")
public class APIController {

	private final String url = "http://localhost:8080/";

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ContentWrapper> submitApplication(@ModelAttribute ContentWrapper wrapper) {
		RestTemplate rest = new RestTemplate();
		rest.postForObject(url, wrapper, ContentWrapper.class);
		return new ResponseEntity<ContentWrapper>(wrapper, HttpStatus.CREATED);
	}

}