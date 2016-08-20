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
    QuestionsService questionsService;

    @RequestMapping()
    public String getApplicationForm(Model model) {
        ContentWrapper wrapper = new ContentWrapper();
        int questionListSize = 0;
        try{
            questionListSize = questionsService.getAllQuestions().size();
            System.out.println("size of list: " + questionListSize);
        } catch (Exception e){
            System.out.println("Boo Boo " + e);
        }
//        List<String> questionText = new ArrayList<String>();
        for (int i = 0; i < questionListSize; i++) {
            System.out.println(questionsService.getAllQuestions().get(i).getQuestion());
//            String question = questionsService.getQuestions().get(i);
            wrapper.add(new Questions());
//            wrapper.getQuestions().get(i).setQuestion(question);
            wrapper.add(new Questions());
        }
//            model.addAttribute("questionText", questionText);
            model.addAttribute("wrapper", wrapper);
        return "application";
    }

}
