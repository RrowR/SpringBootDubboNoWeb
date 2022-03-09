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
    private UserServiceImpl userService;

    /*
        服务端暴露接口
     */
    @Bean
    public RmiServiceExporter rmiServiceExporter(){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort(2022);
        exporter.setServiceName("userService");
        exporter.setService(userService);
        exporter.setServiceInterface(UserService.class);        // 这里貌似使用的是jdk的动态代理，只能使用接口的方式
        return exporter;
    }

}
