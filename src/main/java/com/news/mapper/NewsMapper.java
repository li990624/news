package com.news.mapper;

import com.news.entity.NewsEntity;
import java.util.List;


public interface NewsMapper {
	/*添加新闻*/
	 boolean addNewsDao(NewsEntity newsEntity);
	/* 分页获取新闻*/
	 int NewsTotalNum();
	List<NewsEntity> findNewsByPage(int startIndex, int pageSize);
	/*批量删除新闻*/
	void deleteNews(String id);
   /*用户名和性别查询*/
	int findTotalNumByKey(String key, String value);
	List<NewsEntity> findNewsByKey(String key,String value,int startIndex,int pageSize);
    /*新闻修改*/
	NewsEntity findNewsById(String id);
    void updateNews(NewsEntity newsEntity,String value);
    /*修改新闻当前审核状态*/
    void updateNews2(int id,String value);

  NewsEntity RealTimeRefreshDao(int id);
    /*显示新闻*/
    List<NewsEntity> RealTimeRefreshDao2(String value);
    //通过新闻标题查询出新闻id
    NewsEntity findNewsHeadline(String headline);
    //获取浏览量
    boolean pageView(String newsHeadline);
    //新闻评论总数	
  	void commentSum(int id);
    //查询热点(浏览)新闻
    List<NewsEntity> QueryingHotNews();
    //查询热点(评论)新闻
    List<NewsEntity> QueryingHotNews2();
    //查询热点(今日)新闻
    List<NewsEntity> QueryingHotNews3();
    
}
