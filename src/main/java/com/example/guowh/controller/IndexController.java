package com.example.guowh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * 文件描述
 *
 * @ProductName: Hundsun HEP
 * @ProjectName: SpringBootDemo
 * @Package: com.example.guowh.controller
 * @Description: note
 * @Author: guowh23704
 * @CreateDate: 2019-06-13 14:26
 * @UpdateUser: guowh23704
 * @UpdateDate: 2019-06-13 14:26
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright © 2019 Hundsun Technologies Inc. All Rights Reserved
 **/
@Controller
@RequestMapping("/home")
public class IndexController {

    @GetMapping("/index")
    public String index(HashMap<String, Object> map, String name) {
        if (name == null || name.trim().isEmpty()){
            name = "无名氏";
        }
        map.put("name", name);
        return "index";
    }
}
