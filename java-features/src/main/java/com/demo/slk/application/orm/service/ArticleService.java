package com.demo.slk.application.orm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.slk.application.orm.entity.Article;
import com.demo.slk.application.orm.repository.ArticleDAO;

@Service
public class ArticleService  {
	@Autowired
	private ArticleDAO articleDAO;
	
	public Article getArticleById(int articleId) {
		Article obj = articleDAO.getArticleById(articleId);
		return obj;
	}	
	
	public List<Article> getAllArticles(){
		return articleDAO.getAllArticles();
	}
	
	public synchronized boolean addArticle(Article article){
                if (articleDAO.articleExists(article.getTitle(), article.getCategory())) {
    	            return false;
                } else {
    	            articleDAO.addArticle(article);
    	            return true;
                }
	}
	
	public void updateArticle(Article article) {
		articleDAO.updateArticle(article);
	}
	
	public void deleteArticle(int articleId) {
		articleDAO.deleteArticle(articleId);
	}
}