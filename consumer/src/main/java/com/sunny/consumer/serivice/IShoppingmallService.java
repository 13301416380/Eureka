/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/18
 * Time: 17:13
 */
package com.sunny.consumer.serivice;

import com.sunny.consumer.serivice.impl.ShoppingmallServiceHystrystrixImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
//fallback 回调,发生异常就找这个类
@FeignClient( name = "shoppingmall" ,fallback=ShoppingmallServiceHystrystrixImpl.class)
public interface IShoppingmallService {
    @RequestMapping("/init")
    public List<Map<String,Object>> searchAll();
}