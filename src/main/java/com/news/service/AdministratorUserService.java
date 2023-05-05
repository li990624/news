package com.news.service;

import com.news.entity.AdministratorUserEntity;
import com.news.entity.Page;
import org.springframework.stereotype.Service;

@Service
public interface AdministratorUserService {
  /*超级管理员/主编/记者查询*/
  Page administratorByValue(int pageNum,String value,String url);
  /*模糊查询*/
  Page auByKey(int pageNum,String key, String value,String url);
  /*删除用户*/
  void deleteAu(String[] ids,String value);
  //注册用户
  String AuRegisterServiceImpl(AdministratorUserEntity administratorUserEntity,String value,String value2);
  //查询验证(注册)
  String AuServiceImpl(AdministratorUserEntity administratorUserEntity);
  //查询验证
  String AuServiceImpl2(AdministratorUserEntity administratorUserEntity);
  /*用户登录权限查询*/
  AdministratorUserEntity userRightServiceImpl(AdministratorUserEntity administratorUserEntity);
}
