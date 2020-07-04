/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/17
 * Time: 20:35
 */
package com.sunny.provider.controller;

import com.sunny.provider.bo.Userinfos;
import com.sunny.provider.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class Initctrl {
    @Autowired
    private IUserService iUserService;
    @RequestMapping("/getTableData")
    public List<Map<String,Object>> serchaAll(){
        System.out.println("查询所有用5451户服务");
        return iUserService.findAll();
    }
}