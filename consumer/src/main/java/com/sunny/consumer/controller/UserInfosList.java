/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2020/2/26
 * Time: 16:40
 */
package com.sunny.consumer.controller;

import com.sunny.consumer.serivice.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@CrossOrigin
@RestController
public class UserInfosList {
    @Autowired
    private LoginService loginService;
    @RequestMapping(value = "/getTableData",method = RequestMethod.GET)
    public Map<String,Object> getTableData(){
        Map<String,Object> result= new HashMap<String,Object>();
        List<Map<String,Object>> list=  loginService.getTableData();
        result.put("data",list);
        return result;
    }

}