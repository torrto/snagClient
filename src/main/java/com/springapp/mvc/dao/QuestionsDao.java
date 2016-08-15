package com.springapp.mvc.dao;

import com.springapp.mvc.model.Questions;

/**
 * Created by rhy704 on 8/14/16.
 */
public interface QuestionsDao {

    void saveQuestions(Questions questions);

//    Questions getQuestionbyId (int id);

    String getAnswerById(String id);


}
