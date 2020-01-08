package com.wzt.dao;

import com.wzt.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User,Long> {
}
