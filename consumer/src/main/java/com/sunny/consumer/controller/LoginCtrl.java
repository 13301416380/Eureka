/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/21
 * Time: 17:45
 */
package com.sunny.consumer.controller;

import com.sunny.consumer.serivice.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@CrossOrigin
@RestController
public class LoginCtrl {
    @Autowired
    private LoginService loginService;
    @Autowired
    private HttpSession session;
    @Autowired
    private HttpServletRequest request;
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Map<String,Object> Login(@RequestBody Map<String,Object> map){
        session= request.getSession();
        System.out.println(session);
      map=  loginService.Login(map);
        return map;
    }
}