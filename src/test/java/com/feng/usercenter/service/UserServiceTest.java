package com.feng.usercenter.service;
import com.feng.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @description:
 * @author: feng
 * @Data: 2024/2/29
 */
@SpringBootTest
 public class UserServiceTest {

    @Autowired   
    UserService userService;



    @Test
    public void testAddUser(){

       User user = new User();

       user.setUsername("dogyupi");
       user.setUserAccount("123");
       user.setAvatarUrl("216545");
       user.setGender(0);
       user.setUserPassword("xxx");
       user.setPhone("123");
       user.setEmail("456");
       boolean re = userService.save(user);
       System.out.println(user.getId());
       Assertions.assertTrue(re);
    }
}