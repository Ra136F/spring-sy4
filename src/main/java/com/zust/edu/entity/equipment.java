package com.zust.edu.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class equipment {
    private Integer id;
    private String name;
    private String description;
    private String code;
    private Date  add_time;
    private Float price;
    private String place;
    private Integer user_id;
}
