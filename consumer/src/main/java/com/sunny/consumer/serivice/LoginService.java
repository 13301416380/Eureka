/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/21
 * Time: 17:46
 */
package com.sunny.consumer.serivice;

import com.sunny.consumer.serivice.impl.LoginServiceImpl;
import com.sunny.consumer.serivice.impl.ShoppingmallServiceHystrystrixImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@FeignClient(name = "myprovider" ,fallback=LoginServiceImpl.class)
public interface LoginService {
    @RequestMapping(value = "/login")
    public Map<String,Object> Login( Map<String,Object> map);
    @RequestMapping(value = "/getTableData")
    public List<Map<String,Object>> getTableData();

}
