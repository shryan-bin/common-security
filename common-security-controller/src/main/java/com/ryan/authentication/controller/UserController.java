package com.ryan.authentication.controller;

import com.ryan.authentication.domain.User;
import com.ryan.authentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ryan.shen on 9/27/2018
 */
@RestController
@RequestMapping("apis/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/detail")
    public User queryUserInformation(@RequestParam String userName) {
        return userService.findUserByUserName(userName);
    }
}
