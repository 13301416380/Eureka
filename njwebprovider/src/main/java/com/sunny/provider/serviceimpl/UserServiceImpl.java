/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/17
 * Time: 20:31
 */
package com.sunny.provider.serviceimpl;

import com.sunny.provider.bo.Userinfos;
import com.sunny.provider.dao.IUserDao;
import com.sunny.provider.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao iUserDao;

    public List<Map<String,Object>> findAll(){
        List<Map<String,Object>> list=iUserDao.findAll();
        return list;
    }

}