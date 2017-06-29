package com.ifzer.senapi.service.impl;

import com.ifzer.senapi.dao.UserMapper;
import com.ifzer.senapi.model.User;
import com.ifzer.senapi.service.UserService;
import com.ifzer.senapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/06/29.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
