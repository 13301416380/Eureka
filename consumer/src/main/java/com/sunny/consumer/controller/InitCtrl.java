/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/18
 * Time: 17:36
 */
package com.sunny.consumer.controller;

import com.sunny.consumer.serivice.IShoppingmallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
@CrossOrigin
@RestController
public class InitCtrl {
    @Autowired
    private IShoppingmallService iShoppingmallService;
    @RequestMapping("search")
    public List<Map<String,Object>> searchAll(){
        return iShoppingmallService.searchAll();
    }
}