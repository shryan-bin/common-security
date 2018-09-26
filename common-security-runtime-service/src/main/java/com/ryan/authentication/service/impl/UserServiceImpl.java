package com.ryan.authentication.service.impl;

import com.ryan.authentication.domain.User;
import com.ryan.authentication.repository.UserDao;
import com.ryan.authentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public User findUserByUserName(String userName) {
        return userDao.findByUserName(userName);
    }
}
