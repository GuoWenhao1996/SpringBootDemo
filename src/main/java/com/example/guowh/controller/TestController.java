package com.example.guowh.controller;

import com.example.guowh.util.SystemInfoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件描述
 *
 * @ProductName: Hundsun HEP
 * @ProjectName: SpringBootDemo
 * @Package: com.example.guowh.controller
 * @Description: note
 * @Author: guowh23704
 * @CreateDate: 2019-06-13 11:12
 * @UpdateUser: guowh23704
 * @UpdateDate: 2019-06-13 11:12
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright © 2019 Hundsun Technologies Inc. All Rights Reserved
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    Environment environment;

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/getAuthor")
    public String getAuthor(String name) {
        System.out.println("进入getAuthor:name=" + name);
        if (name == null || name.trim().isEmpty()) {
            return "?name=";
        }
        return "Hello " + name + ",the author is guowh! 请访问http://" + SystemInfoUtil.getServerIp() + ":" + SystemInfoUtil.getServerPort(environment) + "/home/index?name=" + name;
    }

//    @GetMapping("/getAuthor")
//    public String getAuthor(){
//        return "?name=";
//    }

}
