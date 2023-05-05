package com.news.entity;
/*新闻评论*/

import lombok.Data;

@Data
public class CommentEntity {
	private int id;
	private String commentuser;//评论的用户
	private String commentnews;//评论的新闻
	private String commenttime;//评论的时间
	private int commentsum;//评论的总数
	private int user_id;//用户id;
	private int news_id;//新闻id;
	private int pageView;//新闻浏览量
	
}
