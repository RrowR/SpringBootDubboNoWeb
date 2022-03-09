package com.study.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Rrow
 * @date: 2022/3/9 22:38
 */

@Data
public class User implements Serializable {
    private Integer userId;
    private String name;
    private Integer age;
    private String hobby;

}
