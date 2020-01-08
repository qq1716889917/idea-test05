package com.wzt.service;

import com.wzt.bean.User;
import com.wzt.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userDao.deleteById(id);
    }

    @Override
    public User findUserById(Long id) {
        return userDao.findById(id).get();
    }

    @Override
    public void updateUserById(User user) {
        userDao.saveAndFlush(user);
    }

    @Override
    public List<User> findAllUser() {
        return userDao.findAll();
    }
}
