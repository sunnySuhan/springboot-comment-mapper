package com.sgh.service.impl;

import com.sgh.dao.UserDao;
import com.sgh.entity.User;
import com.sgh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;
    @Override
    public List<User> selectAllUsers() {
        return userDao.selectAll();
    }
}
