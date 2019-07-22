package com.lzr.learnGuns.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzr.learnGuns.dao.mapper.UserMapper;
import com.lzr.learnGuns.vo.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public  class UserService extends ServiceImpl<UserMapper,User> {

    @Resource
    UserMapper userMapper;
    @Cacheable(value = "CONSTANT",key ="#name")
    public List<User> getByNmae(String name){
        User user=new User();
        user.setUsername(name);
        userMapper.select(user);
        System.err.println("执行查询了");
        return  userMapper.select(user);
    }

}