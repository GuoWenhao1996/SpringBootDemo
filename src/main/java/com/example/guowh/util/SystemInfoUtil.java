package com.example.guowh.util;

import org.springframework.core.env.Environment;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 文件描述
 *
 * @ProductName: Hundsun HEP
 * @ProjectName: SpringBootDemo
 * @Package: com.example.guowh.util
 * @Description: note
 * @Author: guowh23704
 * @CreateDate: 2019-06-13 15:26
 * @UpdateUser: guowh23704
 * @UpdateDate: 2019-06-13 15:26
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright © 2019 Hundsun Technologies Inc. All Rights Reserved
 **/
public class SystemInfoUtil {

    /**
     * 获取服务端ip
     *
     * @return ip
     */
    public static String getServerIp() {
        InetAddress localHost = null;
        String ip = "0.0.0.0";
        try {
            localHost = Inet4Address.getLocalHost();
            ip = localHost.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return ip;
    }

    /**
     * 获取服务器端口
     *
     * @param environment 需要注入进来的环境变量对象
     * @return
     */
    public static String getServerPort(Environment environment) {
        return environment.getProperty("local.server.port");
    }
}
