package com.news.mapper;

import com.news.entity.AdministratorUserEntity;
import java.util.List;



public interface AdministratorUserMapper {
	/*超级管理员/主编/记者查询*/
	int findTotalNumByKey(String value);
	List<AdministratorUserEntity> findNewsByKey(String value,int startIndex,int pageSize);
	/*用户名和性别查询*/
	int findAuTotalNumByKey(String key, String value);
	List<AdministratorUserEntity> findAuByKey(String key,String value,int startIndex,int pageSize);
	/*删除新闻*/
	void deleteAu(String id,String value);
	//注册用户
	boolean AuRegisterDaoImpl(AdministratorUserEntity administratorUserEntity,String Value,String value2);
	/*查询(注册)*/
    boolean auQuery(AdministratorUserEntity administratorUserEntity);
    //查询(登录)
    boolean auQuery2(AdministratorUserEntity administratorUserEntity);
    //查询(用户权限)
		AdministratorUserEntity user_rights(AdministratorUserEntity administratorUserEntity);
}
