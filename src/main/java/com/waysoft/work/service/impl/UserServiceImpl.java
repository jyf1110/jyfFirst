package com.waysoft.work.service.impl;

import com.waysoft.work.mapper.UserMapper;
import com.waysoft.work.pojo.User;
import com.waysoft.work.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public void insert(User user) {
         userMapper.insert(user);
    }

    @Override
    public void update(User object) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findByAccount(String name) {
        return userMapper.findByAccount(name);
    }

    @Override
    public User findByNameAndpassWord(String name, String passWord) {
        return userMapper.findByNameAndPassWord(name,passWord);
    }
}
