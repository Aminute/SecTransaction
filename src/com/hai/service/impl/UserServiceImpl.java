package com.hai.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.hai.mapper.UserMapper;
import com.hai.pojo.User;
import com.hai.service.UserService;
 
@Service
public class UserServiceImpl implements UserService{
	@Autowired
    UserMapper userMapper;
     
    public List<User> list(){
        return userMapper.list();
    }
}
