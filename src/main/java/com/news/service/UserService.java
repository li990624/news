package com.news.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.news.entity.UserEntity;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    //查询验证(登录)
    boolean serviceLogin2(UserEntity userEntity);
    //查询验证(注册)
    boolean serviceLogin(UserEntity userEntity);
    //添加
    boolean ServiceRegister(UserEntity userEntity);
    /*用户分页显示*/
    Page<UserEntity> showUserInfor(int pageNum, int size);
    /*批量删除*/
    boolean deleteUser(List ids);
    /*用户名和性别查询*/
     Page QueryUserByKey(int pageNum,String key, String value,String url);
     /*用户修改*/
     UserEntity QueryUserById(String id);
     void updateUserById(UserEntity user);
     //查询当前id号
     UserEntity inquireIdService(String username);
     
     
     //前台
     //注册(查询用户是否存在)
     boolean Login(UserEntity userEntity);
     //注册
     boolean Login2(UserEntity userEntity);
    


}
