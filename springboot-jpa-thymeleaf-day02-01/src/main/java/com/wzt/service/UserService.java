package com.wzt.service;

import com.wzt.bean.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUserById(Long id);
    User findUserById(Long id);
    void updateUserById(User user);
    List<User> findAllUser();
}
