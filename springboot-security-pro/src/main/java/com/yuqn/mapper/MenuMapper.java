package com.yuqn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuqn.domain.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper extends BaseMapper<Menu> {
    List<String> selectPermsByUserId(Long userId);
}
