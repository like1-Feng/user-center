package com.feng.usercenter.model;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private Integer gender;
    private String email;
}