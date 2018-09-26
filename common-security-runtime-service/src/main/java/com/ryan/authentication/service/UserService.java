package com.ryan.authentication.service;


import com.ryan.authentication.domain.User;

public interface UserService {

    User findUserByUserName(String userName);

}
