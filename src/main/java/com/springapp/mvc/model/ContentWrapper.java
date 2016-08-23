package com.springapp.mvc.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rhy704 on 8/15/16.
 */
public class ContentWrapper {

    @Autowired
    private User user;
    @Autowired
    private List<Questions> questions;

    public ContentWrapper(){
        this.user = new User();
        this.questions = new ArrayList<Questions>();
    }


    public void add(Questions question) {
        this.questions.add(question);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }
}
