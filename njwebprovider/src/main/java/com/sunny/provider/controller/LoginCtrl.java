/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/21
 * Time: 17:12
 */
package com.sunny.provider.controller;

import com.sunny.provider.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class LoginCtrl {
    @Autowired
    private ILoginService loginService;
    @RequestMapping(value = "/login")
    public Map<String,Object> Login(@RequestBody Map<String,Object> map){


        return  loginService.login(map);
    }


}