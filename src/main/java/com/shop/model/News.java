package com.shop.model;

public class News {
	
	public String news;
	
	public String newsURL;

	public News(String news, String newsURL) {
		super();
		this.news = news;
		this.newsURL = newsURL;
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	public String getNewsURL() {
		return newsURL;
	}

	public void setNewsURL(String newsURL) {
		this.newsURL = newsURL;
	}
	
}
