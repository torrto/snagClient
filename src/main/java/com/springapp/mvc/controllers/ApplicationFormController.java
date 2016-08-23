package com.springapp.mvc.controllers;

import com.springapp.mvc.model.ContentWrapper;
import com.springapp.mvc.model.Questions;
import com.springapp.mvc.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    private int questionListSize;
    private String question;

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

}
