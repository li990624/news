package com.news.entity;

import lombok.Data;

@Data
public class NewsEntity {
	private int id;
	private String  newsCategory;//新闻类别
	private String news;//新闻
	private String headline;//标题
	private String author;//作者
	private String state;//新闻状态
	private String releaseTime;//发布时间
	private int readingquantity;//新闻点击次数
	private int commentsum;//新闻评论总数

	
}
