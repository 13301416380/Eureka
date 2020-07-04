/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/21
 * Time: 17:09
 */
package com.sunny.provider.serviceimpl;

import com.sunny.provider.dao.ILoginDao;
import com.sunny.provider.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;

@Service
public class LoginServiceImpl implements ILoginService {
    @Autowired
    private ILoginDao loginDao;
    public Map<String,Object> login(Map<String,Object> map){
     map=   loginDao.login(map);
        System.out.println(map.toString());
    return map;
    }
}