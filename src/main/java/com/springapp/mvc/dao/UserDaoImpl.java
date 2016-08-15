package com.springapp.mvc.dao;

import com.springapp.mvc.model.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rhy704 on 7/7/16.
 */
@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

    public User findById(int id) {
        return getById(id);
    }

    public void saveUser(User user) {
        persist(user);
    }

    @SuppressWarnings("unchecked")
    public List<User> findAllUsers() {
        Criteria criteria = createEntityCriteria();
        return (List<User>) criteria.list();
    }

    public User getUser(String username) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("username", username));
        User user = (User) criteria.list().get(0);
        return user;
    }

}
