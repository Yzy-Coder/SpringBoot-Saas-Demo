package com.yzy.saasdemo.user.dao;
/**
 * @author yuzhanyue
 * @date 2021/11/23
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yzy.saasdemo.user.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author yuzhanyue
 * @program Saas-demo
 * @description UserMapper类
 * @date 2021-11-23 09:57
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

}
