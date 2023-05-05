package com.news.entity;

import lombok.Data;

@Data
public class UserEntity {
	private int id;//编号
	private String username;//用户名
	private String password;//密码
	private String password2;//确认密码
	private String gender;//性别
	private String email;//邮箱
	private String lastOnlineTime;//最近登录时间
	private String registrationDate;//注册时间
}
