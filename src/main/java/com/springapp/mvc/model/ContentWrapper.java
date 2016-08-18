package com.springapp.mvc.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rhy704 on 8/15/16.
 */
public class ContentWrapper {

    @Autowired
    private User user = new User();
    @Autowired
    private List<Questions> questions;

    public ContentWrapper(){
        this.questions = new ArrayList<Questions>();
    }


    public void add(Questions question) {
        this.questions.add(question);
    }

    private String username;
    private String email;
    private int phone;

    public String getUsername() {
        return user.getUsername();
    }

    public void setUsername(String username) {
        user.setUsername(username);
    }

    public String getEmail() {
        return user.getEmail();
    }

    public void setEmail(String email) {
        user.setEmail(email);
    }

    public int getPhone() {
        return user.getPhone();
    }

    public void setPhone(int phone) {
        user.setPhone(phone);
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
