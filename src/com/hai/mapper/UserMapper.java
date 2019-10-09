package com.hai.mapper;
import java.util.List;

import com.hai.pojo.User;
public interface UserMapper {
	public int add(User user); 
    
    public User get(String user_id);   
        
    public List<User> list();
    
    public User loginCheck(User user);
}