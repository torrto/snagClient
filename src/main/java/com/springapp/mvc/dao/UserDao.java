package com.springapp.mvc.dao;

import com.springapp.mvc.model.User;

import java.util.List;

/**
 * Created by rhy704 on 7/7/16.
 */
public interface UserDao {

    User findById(int id);

    void saveUser(User user);

    List<User> findAllUsers();

    User getUser(String username);

}
