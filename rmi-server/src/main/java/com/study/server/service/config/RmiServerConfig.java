package com.study.server.service.config;

import com.study.server.service.impl.UserServiceImpl;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * @author: Rrow
 * @date: 2022/3/10 0:02
 */
@Configuration
public class RmiServerConfig {

    @Autowired
    private UserService userService;

    /*
        服务端暴露接口
     */
    @Bean
    public RmiServiceExporter rmiServiceExporter(){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(2022);                 // 服务的名称
        exporter.setServiceName("userService");         // 服务的名字
        exporter.setService(userService);               // 这里使用接口还是实现类都是可以的(服务的接口)
        exporter.setServiceInterface(UserService.class);        // 这里貌似使用的是jdk的动态代理，只能使用接口的方式
        return exporter;
    }

}
