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
@RequestMapping("/")
public class APIController {

	@Autowired
	private QuestionsService questionsService;


	private final String url = "http://localhost:8080/";


	// Handles the input from the application form to be sent to the external api for processing
	@ResponseBody
	@RequestMapping(value="/submitForm", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ContentWrapper> submitApplication(@ModelAttribute ContentWrapper wrapper) {

		for(int i = 0; i < questionsService.getAllQuestions().size(); i++){
			wrapper.getQuestions().get(i).setQuestion(questionsService.getAllQuestions().get(i).getQuestion());
			wrapper.getQuestions().get(i).setId(questionsService.getAllQuestions().get(i).getId());
		}
		RestTemplate rest = new RestTemplate();
		rest.postForObject(url, wrapper, ContentWrapper.class);
		return new ResponseEntity<ContentWrapper>(wrapper, HttpStatus.CREATED);
	}

	// Handles the request from the admin to edit the questions and answers in the DB
	@RequestMapping(value="/submitDB", method = RequestMethod.POST)
	public void editDB(@ModelAttribute ContentWrapper admin) {
		for(int i = 0; i < questionsService.getAllQuestions().size(); i++){
			if(admin.getQuestions().get(i).getQuestion() != questionsService.getAllQuestions().get(i).getQuestion()) {
				admin.getQuestions().get(i).setId(questionsService.getAllQuestions().get(i).getId());
				questionsService.editQuestion(admin.getQuestions().get(i).getId(), admin.getQuestions().get(i).getQuestion());
			}
		}
		for(int i = 0; i < questionsService.getAllQuestions().size(); i++){
			if(admin.getQuestions().get(i).getAnswer() != questionsService.getAllQuestions().get(i).getAnswer()) {
				admin.getQuestions().get(i).setId(questionsService.getAllQuestions().get(i).getId());
				questionsService.editAnswer(admin.getQuestions().get(i).getId(), admin.getQuestions().get(i).getAnswer());
			}
		}
	}

}