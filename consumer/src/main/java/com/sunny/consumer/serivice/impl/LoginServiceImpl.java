/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/21
 * Time: 17:46
 */
package com.sunny.consumer.serivice.impl;

import com.sunny.consumer.serivice.LoginService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Component
public class LoginServiceImpl implements LoginService {
    @RequestMapping(value = "/login")
    public Map<String,Object> Login(Map<String, Object> map){
        System.out.println("登录节点服务出现异常");
        return null;
    }
    @RequestMapping(value = "/getTableData")
    public List<Map<String,Object>> getTableData(){
        System.out.println("获取用户列表节点服务出现异常");
        return null;
    };
}
