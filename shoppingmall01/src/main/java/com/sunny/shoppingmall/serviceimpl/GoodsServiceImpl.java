/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/17
 * Time: 23:13
 */
package com.sunny.shoppingmall.serviceimpl;

import com.sunny.shoppingmall.bo.Goods;
import com.sunny.shoppingmall.dao.IGoodsDao;
import com.sunny.shoppingmall.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private IGoodsDao iGoodsDao;

    public List<Map<String,Object>> findAll(){
        return iGoodsDao.findAll();
    }


}