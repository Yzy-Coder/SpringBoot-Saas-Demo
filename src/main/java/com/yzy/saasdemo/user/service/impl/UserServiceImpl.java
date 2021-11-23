package com.yzy.saasdemo.user.service.impl;
/**
 * @author yuzhanyue
 * @date 2021/11/23
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yzy.saasdemo.user.dao.UserMapper;
import com.yzy.saasdemo.user.entity.UserDO;
import com.yzy.saasdemo.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author yuzhanyue
 * @program Saas-demo
 * @description 用户Service实现类
 * @date 2021-11-23 09:56
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

}
