package com.yzy.saasdemo.user.controller;
/**
 * @author yuzhanyue
 * @date 2021/11/23
 */

import com.yzy.saasdemo.user.entity.UserDO;
import com.yzy.saasdemo.user.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuzhanyue
 * @program Saas-demo
 * @description 用户Controller
 * @date 2021-11-23 10:02
 */

@RestController
@RequestMapping("user")
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping("query")
    public UserDO queryUser(Integer userId) {
        System.out.println(userId);
        return this.userService.getById(userId);
    }
}
