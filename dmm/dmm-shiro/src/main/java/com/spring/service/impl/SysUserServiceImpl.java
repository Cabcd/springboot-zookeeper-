package com.spring.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.mapper.SysUserMapper;
import com.spring.po.SysUser;
import com.spring.service.SysUserService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper,SysUser> implements SysUserService {

  /*  @Autowired
    private SysUserMapper sysUserMapper;*/

    @Override
    public void myTest() throws Exception {
//        DbContextHolder.setDbType(DBTypeEnum.shiro);
        SysUser user = new SysUser();
//        user.setId(UUID.randomUUID().toString());
        user.setUsername("alice");
        user.setPassword("123456");
        baseMapper.insert(user);
//        user.insert();
//        Aatest aatest = new Aatest();
//        aatest.setProid("123");
//        aatest.setContent("ksjdjf");
//        aatest.insert();
//        aatest.insert();
//        int i = 1/0;
//        System.err.println("查询插入结果：" + user.selectById().getUsername());
    }

    @Override
    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
    public Page<SysUser> myTest2() throws Exception {
//        DbContextHolder.setDbType(DBTypeEnum.shiro);
        SysUser user = new SysUser();
//        System.err.println("删除所有：" + user.delete(null));
        user.setUsername("alice");
        user.setPassword("123");
//        user.setId(UUID.randomUUID().toString());
        baseMapper.insert(user);

        System.err.println("查询插入结果：" + baseMapper.selectById(user.getId()).getUsername());
        user.setUsername("mybatis-plus-ar");
        System.err.println("更新：" + baseMapper.updateById(user));
//        return baseMapper.selectPage(new Page<SysUser>(),null);
        return null;
    }
}
