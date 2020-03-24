package com.anonym.mavenapp.slaveofmapper;

import com.anonym.mavenapp.bean.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author:Anonym
 * 2020/3/24
 */
@Mapper
public interface PersonMapper {

    List<Person> selectPersonList();
}
