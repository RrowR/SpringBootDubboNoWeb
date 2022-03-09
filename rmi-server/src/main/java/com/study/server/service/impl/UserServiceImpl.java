package com.study.server.service.impl;

import com.study.bean.User;
import com.study.service.UserService;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;

/**
 * @author: Rrow
 * @date: 2022/3/9 23:06
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserByUserId(Integer userId) throws RemoteException {
        System.out.println("服务端收到请求，请求的参数---->>" + userId);
        User user = new User();
        user.setUserId(userId);
        user.setName("猫羽雫");
        user.setAge(16);
        user.setHobby("sleep");
        return user;
    }
}
