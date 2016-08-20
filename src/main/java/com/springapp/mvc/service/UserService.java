package com.springapp.mvc.service;

import com.springapp.mvc.model.Questions;
import com.springapp.mvc.model.User;

import java.util.List;

/**
 * Created by rhy704 on 7/7/16.
 */
public interface UserService {

    User findById(int id);

    void saveUser(User user);

    List<User> findAllUsers();

    User getUser(String username);

}
