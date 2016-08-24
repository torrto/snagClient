package com.springapp.mvc.controllers;

import com.springapp.mvc.model.ContentWrapper;
import com.springapp.mvc.model.Questions;
import com.springapp.mvc.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rhy704 on 8/15/16.
 */
@Controller
@RequestMapping("/")
public class ApplicationFormController {

    @Autowired
    private QuestionsService questionsService;

    private ContentWrapper wrapper;
    private ContentWrapper admin;
    private int questionListSize;
    private String question;
    private String adminQuestion;
    private String adminAnswer;

    @RequestMapping()
    public String getApplicationForm(Model model) {
        wrapper = new ContentWrapper();
        questionListSize = questionsService.getAllQuestions().size();
        for (int i = 0; i < questionListSize; i++) {
            question = questionsService.getAllQuestions().get(i).getQuestion();
            wrapper.add(new Questions());
            wrapper.getQuestions().get(i).setQuestion(question);
        }
            model.addAttribute("wrapper", wrapper);
        return "application";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getAdminPage(Model model) {
        admin = new ContentWrapper();
        questionListSize = questionsService.getAllQuestions().size();
        for (int i = 0; i < questionListSize; i++) {
            adminQuestion = questionsService.getAllQuestions().get(i).getQuestion();
            adminAnswer = questionsService.getAllQuestions().get(i).getAnswer();
            admin.add(new Questions());
            admin.getQuestions().get(i).setQuestion(adminQuestion);
            admin.getQuestions().get(i).setAnswer(adminAnswer);
        }
        model.addAttribute("admin", admin);
        return "admin";
    }

}
