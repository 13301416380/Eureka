/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/17
 * Time: 23:21
 */
package com.sunny.shoppingmall.controller;

import com.sunny.shoppingmall.bo.Goods;
import com.sunny.shoppingmall.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
public class Initctrl {
    @Autowired
    private IGoodsService iGoodsService;
    @Autowired
    private HttpSession session;
    @Autowired
    private HttpServletRequest request;
    @RequestMapping("/init")
    public List<Map<String,Object>> searchAll(){
        System.out.println("我的第二二个服务");
        session= request.getSession();
        System.out.println("session值是~~~~~~~~"+session);
        return iGoodsService.findAll();
    }
}