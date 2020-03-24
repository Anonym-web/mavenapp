package com.anonym.mavenapp.mastermapper;

import com.anonym.mavenapp.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author:Anonym
 * 2020/3/24
 */
@Mapper
public interface UserMapper {

    List<User> selectUserList();
}
