package com.yzy.saasdemo.user.entity;
/**
 * @author yuzhanyue
 * @date 2021/11/23
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author yuzhanyue
 * @program Saas-demo
 * @description 用户类 测试用
 * @date 2021-11-23 09:08
 */


@Data
@Accessors(chain = true)
@TableName("user")
public class UserDO {


    @TableId(type = IdType.AUTO)
    @TableField("user_id")
    public Integer userId;

    @TableField("user_name")
    public String userName;


    @TableField("password")
    public String password;

}
