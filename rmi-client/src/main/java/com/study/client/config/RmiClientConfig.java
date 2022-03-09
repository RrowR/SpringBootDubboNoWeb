package com.study.client.config;

import com.study.server.service.impl.UserServiceImpl;
import com.study.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * @author: Rrow
 * @date: 2022/3/10 0:08
 */
@Configuration
public class RmiClientConfig {
    /*
        订阅远程地址，本质是创建了远程接口的代理对象
     */
    @Bean(name = "userService")
    public RmiProxyFactoryBean getUserService(){
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        // 不是http协议
        rmiProxyFactoryBean.setServiceUrl("rmi://127.0.0.1:2022/userService");
        rmiProxyFactoryBean.setServiceInterface(UserService.class);
        return rmiProxyFactoryBean;
    }
}
