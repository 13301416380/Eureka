/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/17
 * Time: 20:30
 */
package com.sunny.provider.service;

import com.sunny.provider.bo.Userinfos;

import java.util.List;
import java.util.Map;

public interface IUserService {
    public List<Map<String,Object>> findAll();

}