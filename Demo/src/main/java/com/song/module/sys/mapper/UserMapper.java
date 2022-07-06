package com.song.module.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.song.module.sys.entiy.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 王质松
 * @date 2022/7/6 17:03
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
