package com.waysoft.work.test;

import com.waysoft.work.pojo.User;
import com.waysoft.work.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ServiceTest
{
    @Resource
    private UserService userService;
    @Test
    public void test1(){
        User user = userService.findByAccount("4177717");
        System.out.println(user);
    }
}
