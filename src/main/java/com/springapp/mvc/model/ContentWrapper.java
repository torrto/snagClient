package com.springapp.mvc.model;

import java.util.List;

/**
 * Created by rhy704 on 8/15/16.
 */
public class ContentWrapper {

    private User user;

    private List<Questions> questions;

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
