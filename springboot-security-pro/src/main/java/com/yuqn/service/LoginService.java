package com.yuqn.service;

import com.yuqn.domain.ResponseResult;
import com.yuqn.domain.User;

public interface LoginService {
    ResponseResult login(User user);
    ResponseResult logout();
}
