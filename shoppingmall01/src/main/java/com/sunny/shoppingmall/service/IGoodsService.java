/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/17
 * Time: 23:10
 */
package com.sunny.shoppingmall.service;


import com.sunny.shoppingmall.bo.Goods;

import java.util.List;
import java.util.Map;

public interface IGoodsService {
    public List<Map<String,Object>> findAll();

}