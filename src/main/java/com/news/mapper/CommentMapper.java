package com.news.mapper;

import com.news.entity.CommentEntity;
import java.util.List;

/*添加新闻*/
public interface CommentMapper {
	List<CommentEntity> commentDaoImpl(int newsId);
	boolean addCommentDao(CommentEntity commentEntity,int newsId,int userId);
	//查询评论条数
	int commentSum(int newsId);
	//获取浏览量
	void pageView(String newsHeadline);
}
