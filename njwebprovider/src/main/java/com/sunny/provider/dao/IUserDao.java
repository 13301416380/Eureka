/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/17
 * Time: 19:35
 */
package com.sunny.provider.dao;

import com.sunny.provider.bo.Userinfos;

import java.util.List;
import java.util.Map;

public interface IUserDao {
    //查询所有用户列表
    public List<Map<String,Object>> findAll();
    //

}