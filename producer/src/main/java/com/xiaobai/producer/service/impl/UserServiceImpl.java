package com.xiaobai.producer.service.impl;

import com.xiaobai.producer.mapper.UserMapper;
import com.xiaobai.producer.model.po.UserPO;
import com.xiaobai.producer.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserPO> getAll() {
        return userMapper.selectAll();
    }
}
