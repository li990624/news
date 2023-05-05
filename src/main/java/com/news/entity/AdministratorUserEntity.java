package com.news.entity;

import lombok.Data;

@Data
public class AdministratorUserEntity {
	private int id;//编号
	private String username;//用户名
	private String password;//密码
	private String name;//姓名
	private int age;//年龄
	private String gender;//性别
	private String position;//职位
	private String hiredate;//入职时间
}
