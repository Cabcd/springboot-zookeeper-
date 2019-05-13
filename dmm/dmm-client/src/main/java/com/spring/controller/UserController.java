package com.spring.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.core.po.DmmUser;
import com.core.service.UserService;
import com.core.util.JsonResp;
import com.spring.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("client")
public class UserController {
    private static final String url="dubbo://127.0.0.1:20880";

    @Reference(url = url)
	private UserService userService;

    @Autowired
    private TestService testService;

    @RequestMapping("/save")
    public JsonResp<Boolean> saveUser(DmmUser user){
        JsonResp<Boolean> resp=new JsonResp<Boolean>();
        System.out.println("111111111111");
        try {
            Boolean bool =userService.saveUser(user);
            resp.setData(bool);
            resp.setMessage("success");
        }catch(Exception e){
            e.printStackTrace();
        }

        return resp;
    }

    @RequestMapping("/test1")
    public JsonResp<Boolean> test1(){
        JsonResp<Boolean> resp=new JsonResp<Boolean>();
        System.out.println("111111111111");
        try {
            String ss=testService.t1();
            System.out.print(ss);
        }catch(Exception e){
            e.printStackTrace();
        }

        return resp;
    }

}
