package com.news.service.impl;

import com.news.entity.NewsEntity;

import com.news.entity.Page;
import java.util.List;

import com.news.service.NewsService;


public class NewsServiceImpl implements NewsService{

	@Override
	public String addNewsService(NewsEntity newsEntity) {
		return null;
	}

	@Override
	public Page showNewsInfor(String pageNum, String url) {
		return null;
	}

	@Override
	public void deleteNews(String[] ids) {

	}

	@Override
	public Page QueryUserByKey(int pageNum, String key, String value, String url) {
		return null;
	}

	@Override
	public NewsEntity QueryNewsById(String id) {
		return null;
	}

	@Override
	public void updateNews(NewsEntity newsEntity, String value) {

	}

	@Override
	public void updateNews2(int id, String value) {

	}

	@Override
	public NewsEntity showNewsService(int id) {
		return null;
	}

	@Override
	public List<NewsEntity> showNewsService2(String value) {
		return null;
	}

	@Override
	public NewsEntity findHeadline(String headline) {
		return null;
	}

	@Override
	public boolean pageViewService(String newsHeadline) {
		return false;
	}

	@Override
	public void newsCommentSum(int id) {

	}

	@Override
	public List<NewsEntity> findNews() {
		return null;
	}

	@Override
	public List<NewsEntity> findNews2() {
		return null;
	}

	@Override
	public List<NewsEntity> findNews3() {
		return null;
	}

	@Override
	public List<String> getNewsImg(String img) {
		return null;
	}
}
