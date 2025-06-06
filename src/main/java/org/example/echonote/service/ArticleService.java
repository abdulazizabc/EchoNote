package org.example.echonote.service;

import org.example.echonote.dto.ArticleDTO;
import org.example.echonote.model.Article;

import java.util.List;

public interface ArticleService {

    ArticleDTO createArticle(ArticleDTO articleDTO);
    List<ArticleDTO> getArticles();
    ArticleDTO getArticleById(Long id);
    ArticleDTO updateArticle(ArticleDTO articleDTO);
    void deleteArticle(Long id);

}
