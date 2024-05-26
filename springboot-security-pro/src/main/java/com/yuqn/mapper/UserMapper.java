package com.yuqn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuqn.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * @author 35238
 * @date 2023/7/11 0011 20:16
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
