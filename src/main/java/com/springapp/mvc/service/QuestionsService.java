package com.springapp.mvc.service;

import com.springapp.mvc.model.Questions;

import java.util.List;

/**
 * Created by rhy704 on 8/14/16.
 */
public interface QuestionsService {

    List<Questions> getAllQuestions();

    void saveQuestions(Questions questions);

    void editQuestion(String id, String question);

    void editAnswer(String id, String answer);

    String getAnswerById(String id);

}
