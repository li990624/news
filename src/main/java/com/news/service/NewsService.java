package com.news.service;

import com.news.entity.NewsEntity;
import com.news.entity.Page;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface NewsService {
	/*新闻增加*/
		String addNewsService(NewsEntity newsEntity);
		//新闻分页
		Page showNewsInfor(String pageNum, String url);
		/*批量删除*/
    void deleteNews(String[] ids);
    /*新闻模糊查询*/
     Page QueryUserByKey(int pageNum,String key, String value,String url);
     /*新闻修改*/
     NewsEntity QueryNewsById(String id);
     void updateNews(NewsEntity newsEntity,String value);
     /*修改新闻当前审核状态*/
     void updateNews2(int id,String value);
     //热门新闻
     NewsEntity showNewsService(int id);
     //显示新闻
     List<NewsEntity> showNewsService2(String value);
     //通过新闻标题查询出新闻id
   	NewsEntity findHeadline(String headline);
   	//获取浏览量
   	boolean pageViewService(String newsHeadline);
   	//新闻评论总数
   	void newsCommentSum(int id);
   	//查询热点(浏览)新闻
   	List<NewsEntity> findNews();
   	//查询热点(评论)新闻
   	List<NewsEntity> findNews2();
   	//查询热点(最新)新闻
   	List<NewsEntity> findNews3();
   	//获取新闻里面的图片   	
   	List<String> getNewsImg(String img);
}
