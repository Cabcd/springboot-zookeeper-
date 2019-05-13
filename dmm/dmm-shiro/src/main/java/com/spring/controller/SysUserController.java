package com.spring.controller;


import com.spring.po.SysUser;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/1/15.
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

//    @Autowired(required=true)
//    private SysUserService sysUserService;

    /**
     * AR 部分测试
     */
    @GetMapping("/test1")
    public Page<SysUser> test1() {
        try {
//            sysUserService.myTest();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/test2")
    public Object test2() {
        try {
//            return sysUserService.myTest2();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
