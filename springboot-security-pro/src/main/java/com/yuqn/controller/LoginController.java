package com.yuqn.controller;

import com.yuqn.domain.ResponseResult;
import com.yuqn.domain.User;
import com.yuqn.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yuqn
 * @Date: 2024/5/23 17:30
 * @description:
 * 自定义登录接口
 * @version: 1.0
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody User user){
        // 登录
        return loginService.login(user);
    }

    @RequestMapping("/user/logout")
    public ResponseResult logout(){
        return loginService.logout();
    }

}
