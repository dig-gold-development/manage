package com.site.vs.service.impl;
import javax.annotation.Resource;  
  

import org.springframework.stereotype.Service;
import com.site.vs.dao.IUserDao;
import com.site.vs.model.User;
import com.site.vs.service.IUserService;

 


  
  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private IUserDao userDao;  
    
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
  
}  
