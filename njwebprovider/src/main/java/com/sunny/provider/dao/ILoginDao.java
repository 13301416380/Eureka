/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/21
 * Time: 14:25
 */
package com.sunny.provider.dao;

import java.util.Map;

public interface ILoginDao {
    //用户登录
    public Map<String,Object> login(Map<String,Object> map);
}