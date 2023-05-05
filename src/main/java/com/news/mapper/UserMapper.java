package com.news.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.news.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
  //查询(注册)
  boolean userQuery(UserEntity userEntity);
  //增加
  boolean usersIncrease(UserEntity userEntity);
  //查询(登录)
  boolean userQuery2(UserEntity userEntity);
}
