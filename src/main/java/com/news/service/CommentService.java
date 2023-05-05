package com.news.service;

import com.news.entity.CommentEntity;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
	List<CommentEntity> commentService(int newsId);
	String addCommentService(CommentEntity commentEntity,int newsId,int userId);
	//查询新闻条数
	int commentSumService(int id);
}
