package com.zhiyuan.biz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyuan.biz.dao.UserDao;
import com.zhiyuan.biz.service.UserService;
import com.zhiyuan.domain.User;
@Service
public class UserServiceImpl implements UserService {

	//注入Service依赖  
    @Autowired  
    private UserDao userDao;  
  
    /** 
     * @return 
     * @see com.dubbo.service.UserService#getListUser() 
     *<pre> 
     *<li>Author:</li> 
     *<li>Date: 2016年9月23日</li> 
     *</pre> 
     */  
    @Override  
    public List<User> getListUser() {  
        return userDao.getListUser();  
    }  
}
