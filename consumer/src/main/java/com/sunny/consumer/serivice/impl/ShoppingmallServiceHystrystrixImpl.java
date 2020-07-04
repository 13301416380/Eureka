/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/18
 * Time: 17:58
 */
package com.sunny.consumer.serivice.impl;

import com.sunny.consumer.serivice.IShoppingmallService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public class ShoppingmallServiceHystrystrixImpl implements IShoppingmallService{
    public List<Map<String,Object>> searchAll(){
        System.out.println("节点服务出现异常");
        return null;
    }
}