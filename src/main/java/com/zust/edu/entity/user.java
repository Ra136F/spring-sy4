package com.zust.edu.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class user {
    private Integer id;
    private String login_name;
    private String real_name;
    private String password;
    private String tel;
    private String email;
    private Integer type;
    private Date last_login_time;

 }
