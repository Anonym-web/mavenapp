package com.anonym.mavenapp.service;

import com.anonym.mavenapp.bean.User;
import com.anonym.mavenapp.mastermapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:Anonym
 * 2020/3/24
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {

        return userMapper.selectUserList();
    }
}
