package com.waysoft.work.service;

import com.waysoft.work.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService extends CommonService<User> {
    User findByAccount(String name);

    User findByNameAndpassWord(String name,String passWord);
}
