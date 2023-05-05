package com.news.mapper;

import com.news.damin.UserDamain;

import java.util.List;

/*用户分页显示*/
public interface UserShowMapper {
    int UserTotalNum();
    List<UserDamain> findUserByPage(int startIndex, int pageSize);
   /* 批量删除*/
   void deleteUser(String id);
   /*用户名和性别查询*/
   int findTotalNumByKey(String key, String value);
    /*用户名和性别查询*/
    List<UserDamain> findUserByKey(String key,String value,int startIndex,int pageSize);
    /*用户修改*/
    UserDamain findUserById(String id);
    void updateUserById(UserDamain user);
    //查询当前id号
    UserDamain inquireId(String username);
}
