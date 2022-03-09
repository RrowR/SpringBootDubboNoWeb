package com.study.client.controller;

import com.study.bean.User;
import com.study.server.service.impl.UserServiceImpl;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.rmi.RemoteException;

/**
 * @author: Rrow
 * @date: 2022/3/9 23:39
 */
@RestController
public class UserController {

    @Autowired          // 程序没有报错，有远程的接口代理来进行托管
    private UserService userService;

    @GetMapping("/user/{userId}")
    public User queryUserByUserId(@PathVariable Integer userId){
        try {
            return userService.queryUserByUserId(userId);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }
}
