package com.news.service.impl;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.news.entity.UserEntity;
import com.news.mapper.UserMapper;
import com.news.service.UserService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;


public class UserServiceImpl implements UserService{

	@Resource
	UserMapper userMapper;

	//查询验证(登录)
	@Override
	public boolean serviceLogin2(UserEntity userEntity) {
		QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("username",userEntity.getUsername()).eq("password",userEntity.getPassword());
		return userMapper.selectList(queryWrapper).isEmpty();
	}

	//查询验证(注册)
	@Override
	public boolean serviceLogin(UserEntity userEntity) {
		QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("username",userEntity.getUsername());
		return userMapper.selectList(queryWrapper).isEmpty();
	}

	//注册用户
	@Override
	public boolean ServiceRegister(UserEntity userEntity) {
		return userMapper.insert(userEntity) > 0;
	}

	/*用户分页显示*/
	@Override
	public Page<UserEntity> showUserInfor(int pageNum, int size) {
		QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
		Page<UserEntity> page = new Page<>(pageNum,size);
		return userMapper.selectPage(page,null);
	}

	/*批量删除*/
	@Override
	public boolean deleteUser(List ids) {
		return userMapper.deleteBatchIds(ids) >= ids.size();
	}

	@Override
	public Page QueryUserByKey(int pageNum, String key, String value, String url) {
		return null;
	}

	@Override
	public UserEntity QueryUserById(String id) {
		return null;
	}

	@Override
	public void updateUserById(UserEntity user) {

	}

	@Override
	public UserEntity inquireIdService(String username) {
		return null;
	}
	//注册(查询用户是否存在)
	@Override
	public boolean Login(UserEntity userEntity) {
		QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("username",userEntity.getUsername());
		return userMapper.selectList(queryWrapper).isEmpty();
	}

	@Override
	public boolean Login2(UserEntity userEntity) {
		return false;
	}
}
