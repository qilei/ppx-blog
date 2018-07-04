package com.ppx.blog.mapper;

import com.ppx.blog.model.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
@RunWith(SpringRunner.class)
@MybatisTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void shouldSaveAndRetrive() {
        User user = new User();
        user.setUserName("test_user");
        user.setPassword("");
        Date now = new Date();
        user.setCreated(now);
        user.setActivated(now);
        user.setLogged(now);
        userMapper.insertSelective(user);

        List<User> list = userMapper.selectAll();
        assertThat(list).hasSize(1);
    }

}