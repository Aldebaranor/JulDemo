package com.song;

import com.song.module.sys.entiy.User;
import com.song.module.sys.mapper.UserMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 王质松
 * @date 2022/7/6 17:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void crud(){
        User user = new User();
        user.setName("jack");
        user.setPassword("123456");
        user.setAge(1);
        user.setGender(1);
        user.setEmail("123456@163.com");
        int result = userMapper.insert(user);
        System.out.println(result);
    }

}
