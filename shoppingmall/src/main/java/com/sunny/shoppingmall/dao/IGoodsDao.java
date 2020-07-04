/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/17
 * Time: 23:07
 */
package com.sunny.shoppingmall.dao;

import com.sunny.shoppingmall.bo.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface IGoodsDao {
    public List<Map<String,Object>> findAll();
}