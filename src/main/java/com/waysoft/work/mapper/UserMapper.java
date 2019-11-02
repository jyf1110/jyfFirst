package com.waysoft.work.mapper;

import com.waysoft.work.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findByAccount(String name);

    User findByNameAndPassWord(@Param("name") String name,@Param("passWord") String passWord);

    List<User> findAll();
}