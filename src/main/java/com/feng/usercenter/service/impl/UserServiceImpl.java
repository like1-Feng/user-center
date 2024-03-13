package com.feng.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.feng.usercenter.model.domain.User;
import com.feng.usercenter.service.UserService;
import com.feng.usercenter.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author admin
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2024-02-29 19:06:56
*/
@Service("UserService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{


       @Override
       public long userRegister(String userAccount, String userPassword, String checkPassword) {
              return 0;
       }
}




