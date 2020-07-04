/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2020/7/4
 * Time: 13:54
 */
package com.sunny.njweb.Controller;

import com.sunny.njweb.bo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class JvmController {
    @RequestMapping("/user/process")
    @ResponseBody
    public String processUserData() throws InterruptedException {
        ArrayList<User> users = queryUsers();
        for (User user: users) {
            //TODO 业务处理
            System.out.println("user:" + user.toString());
        }
        return "end";

    }

    /**
     * 模拟批量查询用户场景
     * @return 用户对象
     */
    private ArrayList<User> queryUsers() {
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            users.add(new User(i,"zhuge"));
        }
        return users;
    }
}