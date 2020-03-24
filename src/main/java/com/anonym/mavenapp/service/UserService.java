package com.anonym.mavenapp.service;

import com.anonym.mavenapp.bean.User;

import java.util.List;

/**
 * Author:Anonym
 * 2020/3/24
 */
public interface UserService {

    List<User> queryUserList();
}
