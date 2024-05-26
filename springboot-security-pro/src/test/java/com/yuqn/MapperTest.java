package com.yuqn;


import com.alibaba.fastjson.JSON;
import com.yuqn.domain.LoginUser;
import com.yuqn.domain.User;
import com.yuqn.mapper.MenuMapper;
import com.yuqn.mapper.UserMapper;
import com.yuqn.utils.RedisCache;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

/**
 * @author 35238
 * @date 2023/7/11 0011 20:27
 */
@SpringBootTest
public class MapperTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private RedisCache redisCache;
    @Autowired
    public RedisTemplate redisTemplate;

    /**
     * @author: yuqn
     * @Date: 2024/5/23 0:03
     * @description:
     * 通过encode方法加盐加密，注意每次调用方法返回值是不一样的，因为盐不一样
     * @param: null
     * @return: null
     */
    @Test
    public void encodePro(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        // 加密结果 $2a$10$pQINVEhs9MOmcOhLrjtceulTAkWsRbm3oDG.FjLUTDvu9BUJYdYpa
        System.out.println(bCryptPasswordEncoder.encode("123456"));
    }

    @Test
    public void testUserMapper(){
        //查询所有用户
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    public void getCacheObject(){
        Object cacheObject = redisCache.getCacheObject("login:2");
        System.out.println(cacheObject);
    }

    @Test
    public void getpers(){
        System.out.println("menuMapper.selectPermsByUserId(2l) = " + menuMapper.selectPermsByUserId(2l));
    }

}
