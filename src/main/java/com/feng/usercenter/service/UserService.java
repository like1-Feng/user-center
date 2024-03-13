package com.feng.usercenter.service;

import com.feng.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author admin
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2024-02-29 19:06:56
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return 用户id
     */
    long userRegister(String userAccount ,String userPassword, String checkPassword);
}
