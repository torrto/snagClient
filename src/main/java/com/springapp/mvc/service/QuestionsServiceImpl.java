package com.springapp.mvc.service;

import com.springapp.mvc.dao.QuestionsDao;
import com.springapp.mvc.model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by rhy704 on 8/14/16.
 */
@Service("questionsService")
@Transactional
public class QuestionsServiceImpl implements QuestionsService {

    @Autowired
    private QuestionsDao dao;

    public void saveQuestions(Questions questions) {
        dao.saveQuestions(questions);
    }

    public String getAnswerById(String id) {
        return dao.getAnswerById(id);
    }

}
