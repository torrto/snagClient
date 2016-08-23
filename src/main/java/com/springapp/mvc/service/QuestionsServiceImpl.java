package com.springapp.mvc.service;

import com.springapp.mvc.dao.QuestionsDao;
import com.springapp.mvc.model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by rhy704 on 8/14/16.
 */
@Service("questionsService")
@Transactional
public class QuestionsServiceImpl implements QuestionsService {

    @Autowired
    private QuestionsDao dao;

    public List<Questions> getAllQuestions() {
        return dao.getAllQuestions();
    }

    public void saveQuestions(Questions questions) {
        dao.saveQuestions(questions);
    }

    public void editQuestion(String id, String question) { dao.editQuestion(id, question); }

    public void editAnswer(String id, String answer) { dao.editAnswer(id, answer); }

    public String getAnswerById(String id) {
        return dao.getAnswerById(id);
    }

}
