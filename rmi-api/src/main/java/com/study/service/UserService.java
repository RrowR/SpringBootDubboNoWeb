package com.study.service;

import com.study.bean.User;

import java.rmi.RemoteException;

/**
 * @author: Rrow
 * @date: 2022/3/9 22:39
 */
public interface UserService {
    /**
     * 根据用户id查询用户记录
     * @param userId
     * @return
     * @throws RemoteException
     */
    User queryUserByUserId(Integer userId) throws RemoteException;
}
